package dk.jamiemagee.advent2017

import assertk.assert
import assertk.assertions.isEqualTo
import dk.jamiemagee.advent.resourceAsStringList
import org.junit.jupiter.api.Test

internal class Day4Test {

    private val input = resourceAsStringList(2017, 4)

    @Test
    fun `Part one samples`() {
        val sampleInput = mapOf(
                listOf("aa bb cc dd ee") to 1,
                listOf("aa bb cc dd aa") to 0,
                listOf("aa bb cc dd aaa") to 1
        )

        sampleInput.forEach {
            assert(Day4(it.key).partOne()).isEqualTo(it.value)
        }
    }

    @Test
    fun `Part one`() {
        println(Day4(input).partOne())
    }

    @Test
    fun `Part two samples`() {
        val sampleInput = mapOf(
                listOf("abcde fghi") to 1,
                listOf("abcde xyz ecdab") to 0,
                listOf("a ab abc abd abf abj") to 1,
                listOf("iiii oiii ooii oooi oooo") to 1,
                listOf("oiii ioii iioi iiio") to 0
        )

        sampleInput.forEach {
            assert(Day4(it.key).partTwo()).isEqualTo(it.value)
        }
    }

    @Test
    fun `Part two`() {
        println(Day4(input).partTwo())
    }
}