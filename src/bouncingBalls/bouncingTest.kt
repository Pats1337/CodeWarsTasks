package bouncingBalls

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class bouncingTest {
    @Test
    fun test_incorrect_height(){
        val bouncingBall: Bouncing = Bouncing.Base(1.5, 0.66, 1.5)
        val actual = bouncingBall.bouncingBall()
        val expected = -1
        assertEquals(expected, actual)
    }

    @Test
    fun test_incorrect_bounce_outOfMaxValue(){
        val bouncingBall: Bouncing = Bouncing.Base(3.0, 1.22, 1.5)
        val actual = bouncingBall.bouncingBall()
        val expected = -1
        assertEquals(expected, actual)
    }

    @Test
    fun test_incorrect_bounce_outOfMinValue(){
        val bouncingBall: Bouncing = Bouncing.Base(3.0, -12.0, 1.5)
        val actual = bouncingBall.bouncingBall()
        val expected = -1
        assertEquals(expected, actual)
    }

    @Test
    fun test_incorrect_window_negativeValue(){
        val bouncingBall: Bouncing = Bouncing.Base(3.0, 0.66, -12.8)
        val actual = bouncingBall.bouncingBall()
        val expected = -1
        assertEquals(expected, actual)
    }

    @Test
    fun test_incorrect_window_abovePointOfTheBall(){
        val bouncingBall: Bouncing = Bouncing.Base(3.0, 0.66, 3.1)
        val actual = bouncingBall.bouncingBall()
        val expected = -1
        assertEquals(expected, actual)
    }

    @Test
    fun test_incorrect_h_negativeValue(){
        val bouncingBall: Bouncing = Bouncing.Base(-2.0, 0.66, 1.5)
        val actual = bouncingBall.bouncingBall()
        val expected = -1
        assertEquals(expected, actual)
    }

    @Test
    fun test_3rdFloor(){
        val bouncingBall: Bouncing = Bouncing.Base(3.0, 0.66, 1.5)
        val actual = bouncingBall.bouncingBall()
        val expected = 3
        assertEquals(expected, actual)
    }

    @Test
    fun test_30rdFloor(){
        val bouncingBall: Bouncing = Bouncing.Base(30.0, 0.66, 1.5)
        val actual = bouncingBall.bouncingBall()
        val expected = 15
        assertEquals(expected, actual)
    }

    @Test
    fun test_300rdFloor(){
        val bouncingBall: Bouncing = Bouncing.Base(300.0, 0.66, 1.5)
        val actual = bouncingBall.bouncingBall()
        val expected = 25
        assertEquals(expected, actual)
    }

    @Test
    fun test_MaxValueFloor(){
        val bouncingBall: Bouncing = Bouncing.Base(Double.MAX_VALUE, 0.99999, 0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001)
        val actual = bouncingBall.bouncingBall()
        val expected = 259847601
        assertEquals(expected, actual)
    }





}