package dk.jamiemagee.advent2017

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class Day6Test {

    @Test
    fun `Part one samples`() {
        Assertions.assertEquals(4, Day6("2\t4\t1\t2").partOne())
    }

    @Test
    fun `Part one`() {
        println(Day6(resourceAsString("Day6")).partOne())
    }

    @Test
    fun `Part two samples`() {
        Assertions.assertEquals(4, Day6("2\t4\t1\t2").partTwo())
    }

    @Test
    fun `Part two`() {
        println(Day6(resourceAsString("Day6")).partTwo())
    }
}