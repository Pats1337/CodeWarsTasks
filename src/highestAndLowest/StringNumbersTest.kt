package highestAndLowest

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class StringNumbersTest{

    @Test
    fun test(){
        val stringNumbers: StringNumbers = StringNumbers.Base("8 3 -5 42 -1 0 0 -9 4 7 4 -4")
        val actual = stringNumbers.highAndLow()
        val expected: String = "42 -9"
        assertEquals(expected, actual)
    }

    @Test
    fun test_oneInt(){
        val stringNumbers: StringNumbers = StringNumbers.Base("6")
        val actual = stringNumbers.highAndLow()
        val expected: String = "6 6"
        assertEquals(expected, actual)
    }

    @Test
    fun test_similar_elements(){
        val stringNumbers: StringNumbers = StringNumbers.Base("6 6 6 6 6 6")
        val actual = stringNumbers.highAndLow()
        val expected: String = "6 6"
        assertEquals(expected, actual)
    }

    @Test
    fun test_negative(){
        val stringNumbers: StringNumbers = StringNumbers.Base("-6 6 6 6 6 6")
        val actual = stringNumbers.highAndLow()
        val expected: String = "6 -6"
        assertEquals(expected, actual)
    }

}
