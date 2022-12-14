package fizzBuzz

interface Fizzer {

    fun fizzBuzz(): Array<String>

    class Base(private val n: Int) : Fizzer {
        override fun fizzBuzz(): Array<String> {
            val result = mutableListOf<String>()
            for(i in 1..n) {
                if (i % 3 == 0 && i % 5 == 0) {
                    result.add("FizzBuzz")
                } else if (i % 5 == 0) {
                    result.add("Buzz")
                } else if (i % 3 == 0 ) {
                    result.add("Fizz")
                } else {
                    result.add(i.toString())
                }
            }
            return result.toTypedArray()
        }
    }
}