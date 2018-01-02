package dk.jamiemagee.advent2017

import assertk.assert
import assertk.assertions.isEqualTo
import dk.jamiemagee.advent.resourceAsString
import org.junit.jupiter.api.Test

internal class Day6Test {

    private val input = resourceAsString(2017, 6)

    private val sampleInput = "2\t4\t1\t2"

    @Test
    fun `Part one samples`() {
        assert(Day6(sampleInput).partOne()).isEqualTo(4)
    }

    @Test
    fun `Part one`() {
        println(Day6(input).partOne())
    }

    @Test
    fun `Part two samples`() {
        assert(Day6(sampleInput).partTwo()).isEqualTo(4)
    }

    @Test
    fun `Part two`() {
        println(Day6(input).partTwo())
    }
}