package dk.jamiemagee.advent2017

import assertk.assert
import assertk.assertions.isEqualTo
import dk.jamiemagee.advent.TestInput
import org.junit.jupiter.api.Test

internal class Day6Test : TestInput() {

    private val sampleInput = "2\t4\t1\t2"

    @Test
    fun `Part one samples`() {
        assert(Day6(sampleInput).partOne()).isEqualTo(4)
    }

    @Test
    fun `Part one`() {
        printPartOne(Day6(input).partOne())
    }

    @Test
    fun `Part two samples`() {
        assert(Day6(sampleInput).partTwo()).isEqualTo(4)
    }

    @Test
    fun `Part two`() {
        printPartTwo(Day6(input).partTwo())
    }
}
