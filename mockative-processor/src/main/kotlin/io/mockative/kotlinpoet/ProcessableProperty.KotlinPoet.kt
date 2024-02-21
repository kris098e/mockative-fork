package io.mockative.kotlinpoet

import com.squareup.kotlinpoet.*
import io.mockative.INVOCATION_GETTER
import io.mockative.INVOCATION_SETTER
import io.mockative.MOCKABLE
import io.mockative.ProcessableProperty

internal fun ProcessableProperty.buildPropertySpec(): PropertySpec {
    return PropertySpec.builder(name, type, KModifier.OVERRIDE)
        .mutable(declaration.isMutable)
        .getter(buildGetter())
        .setter(if (declaration.isMutable) { buildSetter() } else null)
        .build()
}

private fun ProcessableProperty.buildSetter(): FunSpec {
    val value = ParameterSpec.builder("value", type)
        .build()

    return FunSpec.setterBuilder()
        .addParameter(value)
        .addStatement("%T.invoke<%T>(this, %T(%S, %N), true)", MOCKABLE, type, INVOCATION_SETTER, name, value)
        .build()
}

private fun ProcessableProperty.buildGetter(): FunSpec {
    val returnsUnit = if (type == UNIT) "true" else "false"

    return FunSpec.getterBuilder()
        .addStatement("return %T.invoke<%T>(this, %T(%S), %L)", MOCKABLE, type, INVOCATION_GETTER, name, returnsUnit)
        .build()
}

fun ProcessableProperty.getConstructorParameterValue(
    generatedMockTypes: Map<String, String>
): CodeBlock {
    val propertyType = type.toString().removeSuffix("?")
    val propertyTypeWithoutGenerics = propertyType.substringBefore("<")
    val generics = propertyType.dropWhile { it != '<' }
    val classMock = generatedMockTypes.getOrElse(propertyTypeWithoutGenerics) { "" }

    val constructorParameterInitialization =
        if (classMock.isNotEmpty()) {
            if (generics.isNotEmpty()) {
                CodeBlock.of("%L%L()", classMock, generics)
            } else { // Not generic
                CodeBlock.of("%L()", classMock)
            }
        } else {
            // Whenever it is not a mockative type, we use the valueOf function to get a default value
            CodeBlock.of("%L", valueOf(propertyTypeWithoutGenerics, generics))
        }

    return constructorParameterInitialization
}

private fun valueOf(propertyWithoutGenerics: String, generics: String): String {
    return when (propertyWithoutGenerics) {
        Boolean::class.qualifiedName -> "false"
        Byte::class.qualifiedName -> "0.toByte()"
        Short::class.qualifiedName -> "0.toShort()"
        Char::class.qualifiedName -> "0.toChar()"
        Int::class.qualifiedName -> "0"
        Long::class.qualifiedName -> "0L"
        Float::class.qualifiedName -> "0f"
        Double::class.qualifiedName -> "0.0"

        BooleanArray::class.qualifiedName -> "BooleanArray(0)"
        ByteArray::class.qualifiedName -> "ByteArray(0)"
        ShortArray::class.qualifiedName -> "ShortArray(0)"
        CharArray::class.qualifiedName -> "CharArray(0)"
        IntArray::class.qualifiedName -> "IntArray(0)"
        LongArray::class.qualifiedName -> "LongArray(0)"
        FloatArray::class.qualifiedName -> "FloatArray(0)"
        DoubleArray::class.qualifiedName -> "DoubleArray(0)"
        String::class.qualifiedName -> "\"\""

        "kotlin.collections.ArrayList" -> "ArrayList$generics()"
        "kotlin.collections.ArrayDeque" -> "ArrayDeque$generics()"
        "kotlin.collections.LinkedHashMap" -> "LinkedHashMap$generics()"
        "kotlin.collections.HashMap" -> "HashMap$generics()"
        "kotlin.collections.LinkedHashSet" -> "LinkedHashSet$generics()"
        "kotlin.collections.HashSet" -> "HashSet$generics()"

        else -> error(
            "\nCould not find default value for type $propertyWithoutGenerics\n" +
            "Please open an issue at https://github.com/mockative/mockative, or consider changing the type to a non-final type.")
    }
}
