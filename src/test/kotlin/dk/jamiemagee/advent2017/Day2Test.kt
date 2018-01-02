package dk.jamiemagee.advent2017

import dk.jamiemagee.advent.resourceAsStringList
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day2Test {

    @Test
    fun `Part one samples`() {
        val sampleInput = listOf("5\t1\t9\t5", "7\t5\t3", "2\t4\t6\t8")
        assertEquals(18, Day2(sampleInput).partOne())
    }

    @Test
    fun `Part one`() {
        println(Day2(resourceAsStringList("Day2")).partOne())
    }

    @Test
    fun `Part two samples`() {
        val sampleInput = listOf("5\t9\t2\t8", "9\t4\t7\t3", "3\t8\t6\t5")
        assertEquals(9, Day2(sampleInput).partTwo())

    }

    @Test
    fun `Part two`() {
        println(Day2(resourceAsStringList("Day2")).partTwo())
    }
}