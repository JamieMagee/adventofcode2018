package dk.jamiemagee.advent2017

class Day2(private val input: List<String>) {
    fun partOne(): Int {
        return input.map { it.split('\t').map { it.toInt() } }
                .map { it.max()!! - it.min()!! }
                .sum()
    }

    fun partTwo(): Int {
        return input.map { it.split('\t').map { it.toInt() } }
                .map { it.map { y -> it.map { x -> Pair(x, y) } }.flatten() }
                .flatten()
                .filter { it.first != it.second && it.first % it.second == 0 }
                .map { it.first / it.second }
                .sum()

    }
}