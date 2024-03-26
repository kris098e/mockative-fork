package compare.frameworks.classes

import compare.frameworks.annotations.MockativeMockable

@MockativeMockable
class HelloClass {
    fun sayHello(name: String): String {
        return "Hello, World! from $name"
    }
}