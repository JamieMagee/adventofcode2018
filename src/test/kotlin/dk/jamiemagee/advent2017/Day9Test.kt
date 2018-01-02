package dk.jamiemagee.advent2017

import dk.jamiemagee.advent.resourceAsString
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class Day9Test {

    private val input = resourceAsString(2017, 9)

    @Test
    fun `Part one samples`() {
        val sampleInput = mapOf(
                "{}" to 1,
                "{{{}}}" to 6,
                "{{},{}}" to 5,
                "{{{},{},{{}}}}" to 16,
                "{<a>,<a>,<a>,<a>}" to 1,
                "{{<ab>},{<ab>},{<ab>},{<ab>}}" to 9,
                "{{<!!>},{<!!>},{<!!>},{<!!>}}" to 9,
                "{{<a!>},{<a!>},{<a!>},{<ab>}}" to 3
        )

        sampleInput.forEach {
            Assertions.assertEquals(it.value, Day9(it.key).partOne())
        }
    }

    @Test
    fun `Part one`() {
        println(Day9(input).partOne())
    }

    @Test
    fun `Part two samples`() {
        val sampleInput = mapOf(
                "<>" to 0,
                "<random characters>" to 17,
                "<<<<>" to 3,
                "<{!>}>" to 2,
                "<!!>" to 0,
                "<!!!>>" to 0,
                "<{o\"i!a,<{i<a>" to 10
        )

        sampleInput.forEach {
            Assertions.assertEquals(it.value, Day9(it.key).partTwo())
        }
    }

    @Test
    fun `Part two`() {
        println(Day9(input).partTwo())
    }
}