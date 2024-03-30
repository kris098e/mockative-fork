package myTests

import compare.frameworks.classes.HelloClass1
import io.mockk.every
import io.mockk.mockk
import org.junit.Test

class FirstTest {
    val mock: HelloClass1 = mockk()

    @Test
    fun test() {
        every {
            mock.sayHello("Kristian")
        } returns "hej"

        mock.sayHello("Kristian")
    }
}