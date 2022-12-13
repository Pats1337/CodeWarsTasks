package makeUpperCase

//https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7/train/kotlin

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class StringsTest {
    @Test
    fun test_upperCase() {
        val strings: Strings = Strings.Base("hello")
        val actual = strings.makeUpperCase()
        val expected = "HELLO"
        assertEquals(expected, actual)
    }
}