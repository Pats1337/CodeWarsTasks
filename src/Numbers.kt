interface Numbers {

    fun evenOrOdd():String

    class Base(
        private val number: Int
    ) : Numbers {
        override fun evenOrOdd(): String {
            var result = ""
            if (number % 2 == 0) {
                result = "Even"
            } else {
                result = "Odd"
            }
            return result
        }
    }
}