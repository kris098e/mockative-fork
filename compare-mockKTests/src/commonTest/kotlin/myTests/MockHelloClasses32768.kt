package myTests


import compare.frameworks.classes.*
import io.mockk.*
import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals


class MockHelloClasses32768 {
val mock: HelloClassMethods32768 = mockk()
val mocks = listOf<HelloClassMethods32768>(
mock
)

    @Test
    fun passingTest() {
        Assert.assertTrue(true)
    }

}
