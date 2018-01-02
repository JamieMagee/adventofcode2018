package dk.jamiemagee.advent2017

import assertk.assert
import assertk.assertions.isEqualTo
import dk.jamiemagee.advent.resourceAsStringList
import org.junit.jupiter.api.Test

internal class Day8Test {

    private val input = resourceAsStringList(2017, 8)

    private val sampleInput = listOf(
            "b inc 5 if a > 1",
            "a inc 1 if b < 5",
            "c dec -10 if a >= 1",
            "c inc -20 if c == 10"
    )

    @Test
    fun `Part one samples`() {
        assert(Day8(sampleInput).partOne()).isEqualTo(1)
    }

    @Test
    fun `Part one`() {
        println(Day8(input).partOne())
    }

    @Test
    fun `Part two samples`() {
        assert(Day8(sampleInput).partTwo()).isEqualTo(10)
    }

    @Test
    fun `Part two`() {
        println(Day8(input).partTwo())
    }
}