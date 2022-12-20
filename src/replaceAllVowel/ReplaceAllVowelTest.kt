package replaceAllVowel

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class ReplaceAllVowelTest{
    @Test
    fun test_upperCases(){
        val replaceAllVowel: ReplaceAllVowel = ReplaceAllVowel.Base("A6E7I8O9U10")
        val actual = replaceAllVowel.replaceVowels()
        val expected = "!6!7!8!9!10"
    }
    @Test
    fun test_lowerCases(){
        val replaceAllVowel: ReplaceAllVowel = ReplaceAllVowel.Base("a1e2i3o4u5")
        val actual = replaceAllVowel.replaceVowels()
        val expected = "!1!2!3!4!5"
    }
}