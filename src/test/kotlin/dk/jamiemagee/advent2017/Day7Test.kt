package dk.jamiemagee.advent2017

import assertk.assert
import assertk.assertions.isEqualTo
import dk.jamiemagee.advent.resourceAsStringList
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class Day7Test {

    private val input = resourceAsStringList(2017, 7)

    private val sampleInput = arrayListOf(
            "pbga (66)",
            "xhth (57)",
            "ebii (61)",
            "havc (66)",
            "ktlj (57)",
            "fwft (72) -> ktlj, cntj, xhth",
            "qoyq (66)",
            "padx (45) -> pbga, havc, qoyq",
            "tknk (41) -> ugml, padx, fwft",
            "jptl (61)",
            "ugml (68) -> gyxo, ebii, jptl",
            "gyxo (61)",
            "cntj (57)"
    )

    @Test
    fun `Part one samples`() {
        assert(Day7(sampleInput).partOne()).isEqualTo("tknk")
    }

    @Test
    fun `Part one`() {
        println(Day7(input).partOne())
    }

    @Test
    @Disabled
    fun `Part two samples`() {
        assert(Day7(sampleInput).partTwo()).isEqualTo("ugml")
    }

    @Test
    @Disabled
    fun `Part two`() {
        println(Day7(input).partTwo())
    }
}
