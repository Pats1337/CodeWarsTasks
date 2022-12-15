package twoSum

interface FindSumPair {

    fun twoSum(): Pair<Int, Int>

    class Base(
        private val numbers: IntArray,
        private val target: Int
    ) : FindSumPair {
        override fun twoSum(): Pair<Int, Int> {
            var a: Int = 0
            var b: Int = 0
            for (i in numbers.indices) {
                for (j in i + 1 until numbers.size) {
                    if (numbers[i] + numbers[j] == target) {
                        a = i
                        b = j
                    }
                }
            }
            return a to b
        }
    }
}