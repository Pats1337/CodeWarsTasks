package convertNumberToReversedArrayOfDigits

interface ConvertNumberToReversedArrayOfDigits {

    fun digitize():IntArray

    class Base(private val n:Long):ConvertNumberToReversedArrayOfDigits{
        override fun digitize(): IntArray {
            return n.toString()
                .toList()
                .map { it.toString().toInt() }
                .asReversed()
                .toIntArray()
        }

    }

}