package highestAndLowest

// https://www.codewars.com/kata/554b4ac871d6813a03000035

interface StringNumbers {

    fun highAndLow(): String

    class Base(private val stringNums: String) : StringNumbers {
        override fun highAndLow(): String {
            val splitNums = stringNums.split(" ")
            val intsNums = IntArray(splitNums.size)
            splitNums.indices.forEach { intsNums[it] = splitNums[it].toInt() }
            intsNums.sort()
            return intsNums.last().toString() + " " + intsNums[0].toString()
        }
    }
}