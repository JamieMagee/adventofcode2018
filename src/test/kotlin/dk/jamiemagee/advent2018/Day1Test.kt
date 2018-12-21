package dk.jamiemagee.advent2018

import dk.jamiemagee.advent.TestInput
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class Day1Test : TestInput() {

    @Test
    @Disabled
    fun `Part one samples`() {
        Assertions.assertEquals("", Day1("").partOne())
    }

    @Test
    @Disabled
    fun `Part one`() {
        printPartOne(Day1(input).partOne())
    }

    @Test
    @Disabled
    fun `Part two samples`() {
        Assertions.assertEquals("", Day1("").partTwo())
    }

    @Test
    @Disabled
    fun `Part two`() {
        printPartTwo(Day1(input).partTwo())
    }
}
