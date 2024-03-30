package myTests

import compare.frameworks.classes.HelloClass1
import io.mockative.Mock
import io.mockative.classOf
import io.mockative.every
import io.mockative.mock
import org.junit.Test

class MyTest {

    @Mock
    val mock = mock(classOf<HelloClass1>())

    @Test
    fun test() {
        every {
            mock.sayHello("Kristian")
        }.returns("hej")

        mock.sayHello("Kristian")
    }
}