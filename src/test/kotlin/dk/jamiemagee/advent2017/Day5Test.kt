package dk.jamiemagee.advent2017

import assertk.assert
import assertk.assertions.isEqualTo
import dk.jamiemagee.advent.resourceAsStringList
import org.junit.jupiter.api.Test

internal class Day5Test {

    private val input = resourceAsStringList(2017, 5)

    @Test
    fun `Part one samples`() {
        val sampleInput = listOf("0", "3", "0", "1", "-3")

        assert(Day5(sampleInput).partOne()).isEqualTo(5)
    }

    @Test
    fun `Part one`() {
        println(Day5(input).partOne())
    }

    @Test
    fun `Part two samples`() {
        val sampleInput = listOf("0", "3", "0", "1", "-3")

        assert(Day5(sampleInput).partTwo()).isEqualTo(10)
    }

    @Test
    fun `Part two`() {
        println(Day5(input).partTwo())
    }
}