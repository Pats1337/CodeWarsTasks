package fizzBuzz

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class FizzerTest {
    @Test
    fun test_one_number() {
        val fizzer: Fizzer = Fizzer.Base(1)
        val actual = fizzer.fizzBuzz()
        val expected = arrayOf("1")
        assertEquals(expected, actual)
    }

    @Test
    fun test_three_number() {
        val fizzer: Fizzer = Fizzer.Base(3)
        val actual = fizzer.fizzBuzz()
        val expected = arrayOf("1", "2", "Fizz")
        assertEquals(expected, actual)
    }
}