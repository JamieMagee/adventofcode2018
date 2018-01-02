package dk.jamiemagee.advent2017

import dk.jamiemagee.advent.resourceAsString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day3Test {

    @Test
    fun `Part one samples`() {
        assertEquals(0, Day3("1").partOne())
        assertEquals(3, Day3("12").partOne())
        assertEquals(2, Day3("23").partOne())
        assertEquals(31, Day3("1024").partOne())

    }

    @Test
    fun `Part one`() {
        println(Day3(resourceAsString("Day3")).partOne())
    }

    @Test
    fun `Part two`() {
        println(Day3(resourceAsString("Day3")).partTwo())
    }

}