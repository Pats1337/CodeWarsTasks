package checkForFactor

interface CheckForFactor {

    fun check(): Boolean

    class Base(private val base: Int, private val factor: Int) : CheckForFactor {
        override fun check(): Boolean {
            return base % factor == 0
        }

    }
}