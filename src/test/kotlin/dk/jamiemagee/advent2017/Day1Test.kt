package dk.jamiemagee.advent2017

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day1Test {

    @Test
    fun `Part one samples`() {
        assertEquals(3, Day1("1122").partOne())
        assertEquals(4, Day1("1111").partOne())
        assertEquals(0, Day1("1234").partOne())
        assertEquals(9, Day1("91212129").partOne())
    }

    @Test
    fun `Part one`() {
        println(Day1(resourceAsString("Day1")).partOne())
    }

    @Test
    fun `Part two samples`() {
        assertEquals(6, Day1("1212").partTwo())
        assertEquals(0, Day1("1221").partTwo())
        assertEquals(4, Day1("123425").partTwo())
        assertEquals(12, Day1("123123").partTwo())
        assertEquals(4, Day1("12131415").partTwo())

    }

    @Test
    fun `Part two`() {
        println(Day1(resourceAsString("Day1")).partTwo())
    }
}