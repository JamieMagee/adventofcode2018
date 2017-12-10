package dk.jamiemagee.advent2017

class Day6(private val input: String) {

    fun partOne(): Int {
        val (_, seen) = cycle()
        return seen.size
    }

    fun partTwo(): Int {
        val (current, seen) = cycle()
        return seen.size - seen.indexOf(current)
    }

    private fun cycle(): Result {
        val seen = mutableSetOf<List<Int>>()
        val current = input.split('\t').map { it.toInt() }.toMutableList()
        while (!seen.contains(current)) {
            seen.add(current.toList())
            val max = current.max()
            val index = current.indexOf(max)
            current[index] = 0
            (1..max!!).map { (index + it) % current.size }.forEach {
                current[it] += 1
            }
        }
        return Result(current, seen)
    }

    data class Result(val current: List<Int>, val seen: Set<List<Int>>)
}