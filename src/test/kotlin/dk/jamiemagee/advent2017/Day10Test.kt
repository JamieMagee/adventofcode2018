package dk.jamiemagee.advent2017

import assertk.assert
import assertk.assertions.isEqualTo
import dk.jamiemagee.advent.resourceAsString
import org.junit.jupiter.api.Test

internal class Day10Test {

    private val input = resourceAsString(2017, 10)

    @Test
    fun `Part one`() {
        println(Day10(input).partOne())
    }

    @Test
    fun `Part two samples`() {
        val partTwoSampleInput = mapOf(
                "" to "a2582a3a0e66e6e86e3812dcb672a272",
                "AoC 2017" to "33efeb34ea91902bb2f59c9920caa6cd",
                "1,2,3" to "3efbe78a8d82f29979031a4aa0b16a9d",
                "1,2,4" to "63960835bcdc130f0b66d7ff4f6a5a8e"
        )

        for (input in partTwoSampleInput) {
            assert(Day10(input.key).partTwo()).isEqualTo(input.value)
        }
    }

    @Test
    fun `Part two`() {
        println(Day10(input).partTwo())
    }
}
