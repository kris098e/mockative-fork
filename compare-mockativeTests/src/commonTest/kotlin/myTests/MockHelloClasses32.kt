package myTests

import io.mockative.Mock
import io.mockative.classOf
import io.mockative.mock
import compare.frameworks.classes.*
import io.mockative.every
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MockHelloClasses32 {
@Mock val mock1: HelloClass1 = mock(classOf<HelloClass1>())
@Mock val mock2: HelloClass2 = mock(classOf<HelloClass2>())
@Mock val mock3: HelloClass3 = mock(classOf<HelloClass3>())
@Mock val mock4: HelloClass4 = mock(classOf<HelloClass4>())
@Mock val mock5: HelloClass5 = mock(classOf<HelloClass5>())
@Mock val mock6: HelloClass6 = mock(classOf<HelloClass6>())
@Mock val mock7: HelloClass7 = mock(classOf<HelloClass7>())
@Mock val mock8: HelloClass8 = mock(classOf<HelloClass8>())
@Mock val mock9: HelloClass9 = mock(classOf<HelloClass9>())
@Mock val mock10: HelloClass10 = mock(classOf<HelloClass10>())
@Mock val mock11: HelloClass11 = mock(classOf<HelloClass11>())
@Mock val mock12: HelloClass12 = mock(classOf<HelloClass12>())
@Mock val mock13: HelloClass13 = mock(classOf<HelloClass13>())
@Mock val mock14: HelloClass14 = mock(classOf<HelloClass14>())
@Mock val mock15: HelloClass15 = mock(classOf<HelloClass15>())
@Mock val mock16: HelloClass16 = mock(classOf<HelloClass16>())
@Mock val mock17: HelloClass17 = mock(classOf<HelloClass17>())
@Mock val mock18: HelloClass18 = mock(classOf<HelloClass18>())
@Mock val mock19: HelloClass19 = mock(classOf<HelloClass19>())
@Mock val mock20: HelloClass20 = mock(classOf<HelloClass20>())
@Mock val mock21: HelloClass21 = mock(classOf<HelloClass21>())
@Mock val mock22: HelloClass22 = mock(classOf<HelloClass22>())
@Mock val mock23: HelloClass23 = mock(classOf<HelloClass23>())
@Mock val mock24: HelloClass24 = mock(classOf<HelloClass24>())
@Mock val mock25: HelloClass25 = mock(classOf<HelloClass25>())
@Mock val mock26: HelloClass26 = mock(classOf<HelloClass26>())
@Mock val mock27: HelloClass27 = mock(classOf<HelloClass27>())
@Mock val mock28: HelloClass28 = mock(classOf<HelloClass28>())
@Mock val mock29: HelloClass29 = mock(classOf<HelloClass29>())
@Mock val mock30: HelloClass30 = mock(classOf<HelloClass30>())
@Mock val mock31: HelloClass31 = mock(classOf<HelloClass31>())
@Mock val mock32: HelloClass32 = mock(classOf<HelloClass32>())
val mocks = listOf<HelloClass>(
mock1,
mock2,
mock3,
mock4,
mock5,
mock6,
mock7,
mock8,
mock9,
mock10,
mock11,
mock12,
mock13,
mock14,
mock15,
mock16,
mock17,
mock18,
mock19,
mock20,
mock21,
mock22,
mock23,
mock24,
mock25,
mock26,
mock27,
mock28,
mock29,
mock30,
mock31,
mock32,
)
    @Test
    fun stubbing() {
        mocks.forEach {
            mocks.forEach {
                every { it.sayHello("hello!") }.returns("not hello!")
            }
        }
        mocks.forEach {
            mocks.forEach {
                assertEquals(expected = "not hello!", actual = it.sayHello("hello!"), message = it.toString())
            }
        }
    }
    @Test
    fun passingTest() {
        assertTrue(true)
    }
}
