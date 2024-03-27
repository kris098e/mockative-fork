package myTests

import compare.frameworks.classes.HelloClass
import io.mockk.every
import io.mockk.mockk
import org.junit.Test

class FirstTest {
    val mock: HelloClass = mockk()

    @Test
    fun test() {
        every {
            mock.sayHello("Kristian")
        } returns "hej"

        mock.sayHello("Kristian")
    }
}