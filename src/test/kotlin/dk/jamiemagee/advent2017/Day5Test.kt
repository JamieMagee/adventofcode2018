package dk.jamiemagee.advent2017

import dk.jamiemagee.advent.resourceAsStringList
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class Day5Test {

    @Test
    fun `Part one samples`() {
        val sampleInput = listOf("0", "3", "0", "1", "-3")
        Assertions.assertEquals(5, Day5(sampleInput).partOne())
    }

    @Test
    fun `Part one`() {
        println(Day5(resourceAsStringList("Day5")).partOne())
    }

    @Test
    fun `Part two samples`() {
        val sampleInput = listOf("0", "3", "0", "1", "-3")
        Assertions.assertEquals(10, Day5(sampleInput).partTwo())
    }

    @Test
    fun `Part two`() {
        println(Day5(resourceAsStringList("Day5")).partTwo())
    }
}