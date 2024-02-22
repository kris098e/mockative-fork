package io.mockative.kotlinpoet

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ksp.toAnnotationSpec
import io.mockative.INVOCATION_FUNCTION
import io.mockative.LIST_OF
import io.mockative.MOCKABLE
import io.mockative.ProcessableFunction

internal fun ProcessableFunction.buildFunSpec(): FunSpec {
    val modifiers = buildModifiers()
    val returnsUnit = if (returnType == UNIT) "true" else "false"

    val invocation = if (isSuspend) "suspend" else "invoke"

    val argumentsList = buildArgumentList()
    val listOfArguments = buildListOfArgument(argumentsList)
    val parameterSpecs = buildParameterSpecs()
    val annotationSpecs = getAnnotationSpecs()

    val builder = FunSpec.builder(name)

    val receiver = declaration.extensionReceiver?.toTypeNameMockative(typeParameterResolver)
    if (receiver != null) {
        builder.receiver(receiver)
    }

    builder
        .addModifiers(modifiers)
        .addAnnotations(annotationSpecs)
        .returns(returnType.applySafeAnnotations())
        .addParameters(parameterSpecs)
        .addTypeVariables(typeVariables)

    if (isFromAny) {
        builder.addStatement("return %T.%L<%T>(this, %T(%S, %L), { super.%L(%L) })", MOCKABLE, invocation, returnType, INVOCATION_FUNCTION, name, listOfArguments, name, argumentsList)
    } else {
        builder.addStatement("return %T.%L<%T>(this, %T(%S, %L), %L)", MOCKABLE, invocation, returnType, INVOCATION_FUNCTION, name, listOfArguments, returnsUnit)
    }

    return builder.build()
}

private fun ProcessableFunction.getAnnotationSpecs(): List<AnnotationSpec> {
    val annotations = declaration.annotations.map { it.toAnnotationSpec() }.toList()

    return annotations
}

private fun ProcessableFunction.buildModifiers() = buildList {
    add(KModifier.OVERRIDE)

    if (isSuspend) {
        add(KModifier.SUSPEND)
    }
}

private fun ProcessableFunction.buildArgumentList(): CodeBlock {
    val argumentsListFormat = declaration.parameters.joinToString(", ") { "`%L`" }
    val arguments = declaration.parameters.map { it.name!!.asString() }

    return CodeBlock.builder()
        .add(argumentsListFormat, *arguments.toTypedArray())
        .build()
}

private fun ProcessableFunction.buildListOfArgument(argumentList: CodeBlock): CodeBlock {
    return CodeBlock.builder()
        .add("%M<%T?>(%L)", LIST_OF, ANY, argumentList)
        .build()
}

private fun ProcessableFunction.buildParameterSpecs() = declaration.parameters
    .map { parameter ->
        val name = parameter.name!!.asString()
        val type = parameter.type.toTypeNameMockative(typeParameterResolver)

        val checkedType = type.applySafeAnnotations()

        val modifiers = buildList {
            if (parameter.isVararg) {
                add(KModifier.VARARG)
            }
        }

        ParameterSpec.builder(name, checkedType, modifiers)
            .build()
    }
