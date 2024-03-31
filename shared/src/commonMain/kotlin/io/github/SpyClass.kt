package io.github

@MockativeMockable
class SpyClass(val name: String) {
    fun greet(): String {
        return "Hello, $name"
    }

    fun functionWithManyArguments(
        string: String,
        int: Int,
        long: Long,
        list: List<String>
    ): String {
        return "$string $int $long $list"
    }
}

fun SpyClass.extensionFunction(): String {
    return "Hello, $name"
}

fun SpyClass.hello(): String {
    return "Hello, $name"
}

fun String.hello(): String {
    return "Hello, $this"
}