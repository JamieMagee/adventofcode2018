package dk.jamiemagee.advent2017

class Day9(private val input: String) {

    private val not = Regex("!.")

    private val garbage = Regex("<.*?>")

    private val cleanInput: String

    init {
        cleanInput = input.replace(not, "").replace(garbage, "")
    }

    fun partOne(): Int {
        var total = 0
        var score = 0
        cleanInput.forEach {
            when (it) {
                '{' -> score++
                '}' -> total += score--
            }
        }
        return total
    }

    fun partTwo(): Int {
        val garbageInput = garbage.findAll(input.replace(not, "")).map { it -> it.value.length - 2 }
        return garbageInput.reduce { x, y -> x + y }
    }

}