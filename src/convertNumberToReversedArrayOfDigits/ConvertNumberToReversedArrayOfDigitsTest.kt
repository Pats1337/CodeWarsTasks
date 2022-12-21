package convertNumberToReversedArrayOfDigits

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class ConvertNumberToReversedArrayOfDigitsTest {
    @Test
    fun test_1() {
        val convertNumberToReversedArrayOfDigits: ConvertNumberToReversedArrayOfDigits =
            ConvertNumberToReversedArrayOfDigits.Base(123456)
        val actual = convertNumberToReversedArrayOfDigits.digitize()
        val expected = intArrayOf(6, 5, 4, 3, 2, 1)
        assertEquals(expected, actual)
    }
}