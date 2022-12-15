package twoSum

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class FindSumPairTest {
    @Test
    fun test_1() {
        val findSumPair: FindSumPair = FindSumPair.Base(intArrayOf(1,2,3),4)
        val actual = findSumPair.twoSum()
        val expected = Pair(0,2)
        assertEquals(expected,actual)
    }
    @Test
    fun test_2() {
        val findSumPair: FindSumPair = FindSumPair.Base(intArrayOf(1234,5678,9012), 14690)
        val actual = findSumPair.twoSum()
        val expected = Pair(1,2)
        assertEquals(expected,actual)
    }
}