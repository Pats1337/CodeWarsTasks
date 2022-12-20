package replaceAllVowel

interface ReplaceAllVowel {

    fun replaceVowels(): String

    class Base(private val s: String) : ReplaceAllVowel {
        override fun replaceVowels(): String {
           return s.replace("[aeiouAEIOU]".toRegex(), "!")

        }
    }
}