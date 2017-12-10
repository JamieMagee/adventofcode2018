package dk.jamiemagee.advent2017

import java.util.stream.Collectors

class Day7(private val input: List<String>) {

    fun partOne(): String {
        val weight = mutableMapOf<String, Int>()
        val children = mutableMapOf<String, List<String>>()

        for (info in input) {
            val result = Regex("\\w+").findAll(info).toList()
            val program = result.component1().value
            weight[program] = result.component2().value.toInt()
            children[program] = result.subList(2, result.size).map { it.value }
        }
        val childrenSet = children.values.stream()
                .flatMap { it.stream() }
                .collect(Collectors.toSet())

        return (weight.keys - childrenSet).first()
    }

    fun partTwo() {

    }
}