package prem.world.emptyview

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test


class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(5, 2 + 3)
    }

    @Test
    fun generateNumber() {
        val dice = Dice(6)
        val diceResult= dice.roll()
        Assert.assertTrue("The value of rollResult was not between 1 and 6", diceResult in 1..6)
    }

}