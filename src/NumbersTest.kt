import org.junit.Test
import kotlin.test.assertEquals


internal class NumbersTest {

    @Test
    fun test_even() {
        val numbers: Numbers = Numbers.Base(2)
        val actual = numbers.evenOrOdd()
        val expected: String = "Even"
        assertEquals(expected, actual)
    }

    @Test
    fun test_Odd() {
        val numbers: Numbers = Numbers.Base(3)
        val actual = numbers.evenOrOdd()
        val expected: String = "Even"
        assertEquals(expected, actual)
    }

}