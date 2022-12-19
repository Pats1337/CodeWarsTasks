package getTheMiddleCharacter

interface GetTheMiddleCharacter {
    fun getChar(): String
    class Base(private val word: String) : GetTheMiddleCharacter {
        override fun getChar(): String {
            return if (word.length > 2) {
                if (word.length % 2 != 0) {
                    word.substring((word.length / 2), (word.length / 2) +1)
                } else {
                    word.substring((word.length / 2) - 1, (word.length / 2) + 1)
                }
            } else {
                word
            }
        }
    }
}