package dk.jamiemagee.advent2017

import assertk.assert
import assertk.assertions.isEqualTo
import dk.jamiemagee.advent.TestInput
import org.junit.jupiter.api.Test

internal class Day3Test : TestInput() {

    @Test
    fun `Part one samples`() {
        val sampleInput = mapOf(
                "1" to 0,
                "12" to 3,
                "23" to 2,
                "1024" to 31
        )

        sampleInput.forEach {
            assert(Day3(it.key).partOne()).isEqualTo(it.value)
        }
    }

    @Test
    fun `Part one`() {
        printPartOne(Day3(input).partOne())
    }

    @Test
    fun `Part two`() {
        printPartTwo(Day3(input).partTwo())
    }

}
