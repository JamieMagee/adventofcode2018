package dk.jamiemagee.advent2017

import dk.jamiemagee.advent.resourceAsString
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class Day10Test {
    @Test
    fun `Part one samples`() {
        Assertions.assertEquals("", Day10("").partOne())
    }

    @Test
    fun `Part one`() {
        Assertions.assertEquals(resourceAsString("Day10"), Day10("").partOne())
    }

    @Test
    fun `Part two samples`() {
        Assertions.assertEquals("", Day10("").partTwo())
    }

    @Test
    fun `Part two`() {
        Assertions.assertEquals(resourceAsString("Day10"), Day10("").partTwo())
    }
}
