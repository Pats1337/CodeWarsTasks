package evenOrOdd

import org.junit.Test
import kotlin.test.assertEquals


internal class NumbersTest {

    @Test
    fun test_even_positive() {
        val numbers: Numbers = Numbers.Base(2)
        val actual = numbers.evenOrOdd()
        val expected: String = "Even"
        assertEquals(expected, actual)
    }

    @Test
    fun test_even_negative() {
        val numbers: Numbers = Numbers.Base(-16)
        val actual = numbers.evenOrOdd()
        val expected: String = "Even"
        assertEquals(expected, actual)
    }

    @Test
    fun test_Odd_positive() {
        val numbers: Numbers = Numbers.Base(3)
        val actual = numbers.evenOrOdd()
        val expected: String = "Odd"
        assertEquals(expected, actual)
    }

    @Test
    fun test_Odd_negative() {
        val numbers: Numbers = Numbers.Base(-133)
        val actual = numbers.evenOrOdd()
        val expected: String = "Odd"
        assertEquals(expected, actual)
    }

}