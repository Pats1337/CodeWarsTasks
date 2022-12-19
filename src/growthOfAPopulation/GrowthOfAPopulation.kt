package growthOfAPopulation

interface GrowthOfAPopulation {

    fun whenGrowthOfAPopulation(): Int

    class Base(
        private val pp0: Int,
        private val percent: Double,
        private val aug: Int,
        private val p: Int
    ) : GrowthOfAPopulation {
        override fun whenGrowthOfAPopulation(): Int {
            var count: Int = 0
            var pp1: Int = pp0
            while (pp1 < p) {
                pp1 = (pp1 + (pp1 * (percent * 0.01)) + aug).toInt()
                count++
            }
            return count
        }

    }
}