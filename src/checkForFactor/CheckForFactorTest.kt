package checkForFactor

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class CheckForFactorTest{
    @Test
    fun test_factor(){
        val checkForFactor: CheckForFactor = CheckForFactor.Base(10,2)
        val actual = checkForFactor.check()
        val expected = true
    }
    @Test
    fun test_not_factor(){
        val checkForFactor: CheckForFactor = CheckForFactor.Base(9,2)
        val actual = checkForFactor.check()
        val expected = false
    }
    @Test
    fun test_MaxValue(){
        val checkForFactor: CheckForFactor = CheckForFactor.Base(Int.MAX_VALUE,2)
        val actual = checkForFactor.check()
        val expected = false
    }
    @Test
    fun test_MinValue(){
        val checkForFactor: CheckForFactor = CheckForFactor.Base(Int.MIN_VALUE,2)
        val actual = checkForFactor.check()
        val expected = false
    }
    @Test
    fun test_factor3(){
        val checkForFactor: CheckForFactor = CheckForFactor.Base(33,3)
        val actual = checkForFactor.check()
        val expected = true
    }
}