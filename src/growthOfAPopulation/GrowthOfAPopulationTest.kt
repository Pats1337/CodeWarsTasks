package growthOfAPopulation

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class GrowthOfAPopulationTest{
    @Test
    fun test_1(){
        val growthOfAPopulation : GrowthOfAPopulation = GrowthOfAPopulation.Base(1500, 5.0, 100, 5000)
        val actual  = growthOfAPopulation.whenGrowthOfAPopulation()
        val expected = 15
        assertEquals(expected, actual)
    }
    @Test
    fun test_2(){
        val growthOfAPopulation : GrowthOfAPopulation = GrowthOfAPopulation.Base(1500000, 2.5, 10000, 2000000)
        val actual  = growthOfAPopulation.whenGrowthOfAPopulation()
        val expected = 10
        assertEquals(expected, actual)
    }
    @Test
    fun test_3(){
        val growthOfAPopulation : GrowthOfAPopulation = GrowthOfAPopulation.Base(1500000, 0.0, 10000, 2000000)
        val actual  = growthOfAPopulation.whenGrowthOfAPopulation()
        val expected = 50
        assertEquals(expected, actual)
    }
}