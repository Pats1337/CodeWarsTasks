package makeUpperCase

interface Strings {
    fun makeUpperCase(): String
    class Base(private val str: String) : Strings {
        override fun makeUpperCase(): String {
            return str.toUpperCase()
        }
    }
}