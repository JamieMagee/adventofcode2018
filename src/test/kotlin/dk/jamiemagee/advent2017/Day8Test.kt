package dk.jamiemagee.advent2017

import dk.jamiemagee.advent.resourceAsStringList
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class Day8Test {

    private val sampleInput = listOf(
            "b inc 5 if a > 1",
            "a inc 1 if b < 5",
            "c dec -10 if a >= 1",
            "c inc -20 if c == 10"
    )

    @Test
    fun `Part one samples`() {
        Assertions.assertEquals(1, Day8(sampleInput).partOne())
    }

    @Test
    fun `Part one`() {
        println(Day8(resourceAsStringList("Day8")).partOne())
    }

    @Test
    fun `Part two samples`() {
        Assertions.assertEquals(10, Day8(sampleInput).partTwo())
    }

    @Test
    fun `Part two`() {
        println(Day8(resourceAsStringList("Day8")).partTwo())
    }
}