package io.mockative

import kotlin.test.Test
import kotlin.test.assertTrue

class PopulatedClassTests {
    @Mock
    val mock = mock(classOf<PopulatedClass>())

    @Mock
    val class2Mock = mock(classOf<Class2>())

    @Mock
    val class3Mock = mock(classOf<Class3>())

    @Test
    fun isMockEmptyClass() {
        assertTrue(isMock(mock))
    }

    @Test
    fun givenExpectationSetup_thenExpectationIsReturned() {
        // Given
        every { mock.greet() }.returns("This is not hello")

        // When
        val result = mock.greet()

        // Then
        assertTrue(result == "This is not hello")
    }

    @Test
    fun givenNoExpectationOnMockedConstrcutorParameter_thenMissingExpectationIsThrown() {
        // Given / when
        val exception = try {
            mock.class2
        } catch (e: Exception) {
            e
        }

        // Then
        assertTrue(exception is MissingExpectationException)
    }

    @Test
    fun givenExpectationOnMockedConstrcutorParameter_thenExpectationIsReturned() {
        // Given
        every { mock.class2 }.returns(class2Mock)
        every { class2Mock.message1 }.returns("something not message1 in class2")
        every { class2Mock.class3 }.returns(class3Mock)
        every { class3Mock.message1 }.returns("something not message1 in class3")

        // When
        val getClass2FromMockResult = mock.class2
        val resultGetPropertyInClass2 = getClass2FromMockResult.message1
        val resultGetPropertyInClass3 = getClass2FromMockResult.class3.message1

        // Then
        assertTrue(getClass2FromMockResult == class2Mock)
        assertTrue(resultGetPropertyInClass2 == "something not message1 in class2")
        assertTrue(resultGetPropertyInClass3 == "something not message1 in class3")
    }
}
