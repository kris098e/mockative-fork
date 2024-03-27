import compare.frameworks.classes.HelloClass
import compare.frameworks.classes.Se
import io.mockative.Mock
import io.mockative.classOf
import io.mockative.every
import io.mockative.mock
import org.junit.Test

class MyTest {

    @Mock
    val mock = mock(classOf<HelloClass>())

    @Test
    fun test() {
        every {
            mock.sayHello("Kristian")
        }.returns("hej")

        mock.sayHello("Kristian")
    }
}