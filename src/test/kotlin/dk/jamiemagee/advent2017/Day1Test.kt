package dk.jamiemagee.advent2017

import assertk.assert
import assertk.assertions.isEqualTo
import dk.jamiemagee.advent.resourceAsString
import org.junit.jupiter.api.Test

internal class Day1Test {

    private val input = resourceAsString(2017, 1)

    @Test
    fun `Part one samples`() {
        val sampleInput = mapOf(
                "1122" to 3,
                "1111" to 4,
                "1234" to 0,
                "91212129" to 9
        )

        sampleInput.forEach {
            assert(Day1(it.key).partOne()).isEqualTo(it.value)
        }
    }

    @Test
    fun `Part one`() {
        println(Day1(input).partOne())
    }

    @Test
    fun `Part two samples`() {
        val sampleInput = mapOf(
                "1212" to 6,
                "1221" to 0,
                "123425" to 4,
                "123123" to 12,
                "12131415" to 4
        )

        sampleInput.forEach {
            assert(Day1(it.key).partTwo()).isEqualTo(it.value)
        }
    }

    @Test
    fun `Part two`() {
        println(Day1(input).partTwo())
    }
}