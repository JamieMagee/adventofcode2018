package dk.jamiemagee.advent2017

class Day1(private val input: String) {

    fun partOne(): Int {
        var sum = 0
        val length = input.length
        val offset = 1

        input.withIndex().forEach { (index, value) ->
            if (value == input[(index + offset) % length]) {
                sum += Character.getNumericValue(value)
            }
        }

        return sum
    }

    fun partTwo(): Int {
        var sum = 0
        val length = input.length
        val offset = length / 2

        input.withIndex().forEach { (index, value) ->
            if (value == input[(index + offset) % length]) {
                sum += Character.getNumericValue(value)
            }
        }

        return sum
    }
}