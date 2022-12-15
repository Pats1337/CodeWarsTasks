package smallEnough

interface SmallEnough {

    fun smallEnough(): Boolean

    class Base(private val a: IntArray, private val limit: Int):SmallEnough {
        override fun smallEnough(): Boolean {
            return a.maxOrNull()!! <= limit
        }

    }
}
