package dk.jamiemagee.advent2017

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class Day7Test {

    private val sampleInput = arrayListOf("pbga (66)",
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
            "cntj (57)")

    @Test
    fun `Part one samples`() {
        Assertions.assertEquals("tknk", Day7(sampleInput).partOne())
    }

    @Test
    fun `Part one`() {
        println(Day7(resourceAsStringList("Day7")).partOne())
    }

    @Test
    fun `Part two samples`() {
        Assertions.assertEquals("ugml", Day7(sampleInput).partTwo())
    }

    @Test
    fun `Part two`() {
        println(Day7(resourceAsStringList("Day7")).partTwo())
    }
}