package dk.jamiemagee.advent2017

import dk.jamiemagee.advent.resourceAsStringList
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day4Test {
    @Test
    fun `Part one samples`() {
        assertEquals(1, Day4(listOf("aa bb cc dd ee")).partOne())
        assertEquals(0, Day4(listOf("aa bb cc dd aa")).partOne())
        assertEquals(1, Day4(listOf("aa bb cc dd aaa")).partOne())
    }

    @Test
    fun `Part one`() {
        println(Day4(resourceAsStringList("Day4")).partOne())
    }

    @Test
    fun `Part two samples`() {
        assertEquals(1, Day4(listOf("abcde fghi")).partTwo())
        assertEquals(0, Day4(listOf("abcde xyz ecdab")).partTwo())
        assertEquals(1, Day4(listOf("a ab abc abd abf abj")).partTwo())
        assertEquals(1, Day4(listOf("iiii oiii ooii oooi oooo")).partTwo())
        assertEquals(0, Day4(listOf("oiii ioii iioi iiio")).partTwo())

    }

    @Test
    fun `Part two`() {
        println(Day4(resourceAsStringList("Day4")).partTwo())
    }
}