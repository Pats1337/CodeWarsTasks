package smallEnough

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class SmallEnoughTest {
    @Test
    fun test_1(){
        val smallEnoughs: SmallEnough = SmallEnough.Base(intArrayOf(1, 2, 3), 100)
        val actual = smallEnoughs.smallEnough()
        val expected = true
        assertEquals(expected, actual)
    }

    @Test
    fun test_2(){
        val smallEnoughs: SmallEnough = SmallEnough.Base(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100)
        val actual = smallEnoughs.smallEnough()
        val expected = false
        assertEquals(expected, actual)
    }
}
