package dk.jamiemagee.advent2017

import assertk.assert
import assertk.assertions.isEqualTo
import dk.jamiemagee.advent.resourceAsStringList
import org.junit.jupiter.api.Test

internal class Day2Test {

    private val input = resourceAsStringList(2017, 2)

    @Test
    fun `Part one samples`() {
        val sampleInput = listOf("5\t1\t9\t5", "7\t5\t3", "2\t4\t6\t8")

        assert(Day2(sampleInput).partOne()).isEqualTo(18)
    }

    @Test
    fun `Part one`() {
        println(Day2(input).partOne())
    }

    @Test
    fun `Part two samples`() {
        val sampleInput = listOf("5\t9\t2\t8", "9\t4\t7\t3", "3\t8\t6\t5")

        assert(Day2(sampleInput).partTwo()).isEqualTo(9)
    }

    @Test
    fun `Part two`() {
        println(Day2(input).partTwo())
    }
}