package getTheMiddleCharacter

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class GetTheMiddleCharacterTest {
    @Test
    fun test_test() {
        val getTheMiddleCharacter: GetTheMiddleCharacter = GetTheMiddleCharacter.Base("test")
        val actual = getTheMiddleCharacter.getChar()
        val expected = "es"
        assertEquals(expected, actual)
    }
    @Test
    fun test_adcdefg() {
        val getTheMiddleCharacter: GetTheMiddleCharacter = GetTheMiddleCharacter.Base("adcdefg")
        val actual = getTheMiddleCharacter.getChar()
        val expected = "d"
        assertEquals(expected, actual)
    }
    @Test
    fun test_adcde() {
        val getTheMiddleCharacter: GetTheMiddleCharacter = GetTheMiddleCharacter.Base("adcde")
        val actual = getTheMiddleCharacter.getChar()
        val expected = "c"
        assertEquals(expected, actual)
    }
    @Test
    fun test_a() {
        val getTheMiddleCharacter: GetTheMiddleCharacter = GetTheMiddleCharacter.Base("a")
        val actual = getTheMiddleCharacter.getChar()
        val expected = "a"
        assertEquals(expected, actual)
    }
    @Test
    fun test_aa() {
        val getTheMiddleCharacter: GetTheMiddleCharacter = GetTheMiddleCharacter.Base("aa")
        val actual = getTheMiddleCharacter.getChar()
        val expected = "aa"
        assertEquals(expected, actual)
    }
    @Test
    fun test_abcdefgh() {
        val getTheMiddleCharacter: GetTheMiddleCharacter = GetTheMiddleCharacter.Base("abcdefgh")
        val actual = getTheMiddleCharacter.getChar()
        val expected = "de"
        assertEquals(expected, actual)
    }
    @Test
    fun test_aaaaaaaaaabaaaaaaaaaa() {
        val getTheMiddleCharacter: GetTheMiddleCharacter = GetTheMiddleCharacter.Base("aaaaaaaaaabaaaaaaaaaa")
        val actual = getTheMiddleCharacter.getChar()
        val expected = "b"
        assertEquals(expected, actual)
    }
    @Test
    fun test_aaaaaaaaaabbaaaaaaaaaa() {
        val getTheMiddleCharacter: GetTheMiddleCharacter = GetTheMiddleCharacter.Base("aaaaaaaaaabbaaaaaaaaaa")
        val actual = getTheMiddleCharacter.getChar()
        val expected = "bb"
        assertEquals(expected, actual)
    }
}