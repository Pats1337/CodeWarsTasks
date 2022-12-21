package theFeastOfManyBeasts

interface TheFeastOfManyBeasts {
    fun feast(): Boolean

    class Base(private val beast: String, private val dish: String) : TheFeastOfManyBeasts {
        override fun feast(): Boolean {
            return beast.startsWith(dish.first()) && beast.endsWith(dish.last())
        }
    }
}