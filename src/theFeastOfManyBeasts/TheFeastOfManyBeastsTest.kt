package theFeastOfManyBeasts

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class TheFeastOfManyBeastsTest {
    @Test
    fun test_1() {
        val theFeastOfManyBeasts: TheFeastOfManyBeasts = TheFeastOfManyBeasts.Base("great blue heron", "garlic naan")
        val actual = theFeastOfManyBeasts.feast()
        val expected = true
        assertEquals(expected, actual)
    }
    @Test
    fun test_2() {
        val theFeastOfManyBeasts: TheFeastOfManyBeasts = TheFeastOfManyBeasts.Base("electric eel", "lasagna")
        val actual = theFeastOfManyBeasts.feast()
        val expected = false
        assertEquals(expected, actual)
    }
    @Test
    fun test_3() {
        val theFeastOfManyBeasts: TheFeastOfManyBeasts = TheFeastOfManyBeasts.Base("blue-footed booby", "blueberry")
        val actual = theFeastOfManyBeasts.feast()
        val expected = true
        assertEquals(expected, actual)
    }
    @Test
    fun test_4() {
        val theFeastOfManyBeasts: TheFeastOfManyBeasts = TheFeastOfManyBeasts.Base("brown bear", "bear claw")
        val actual = theFeastOfManyBeasts.feast()
        val expected = false
        assertEquals(expected, actual)
    }
}