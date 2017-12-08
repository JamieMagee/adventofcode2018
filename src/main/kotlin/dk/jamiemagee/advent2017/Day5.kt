package dk.jamiemagee.advent2017

class Day5(private val input: List<String>) {

    private val intInput = input.map { it.toInt() }.toIntArray()

    fun partOne(): Int {
        var currentPos = 0
        var steps = 0

        while (true) {
            try {
                currentPos += intInput[currentPos]++
                steps++
            } catch (e: Exception) {
                break
            }
        }

        return steps
    }

    fun partTwo(): Int {
        var currentPos = 0
        var steps = 0

        while (true) {
            try {
                currentPos += if (intInput[currentPos] > 2) intInput[currentPos]-- else intInput[currentPos]++
                steps++
            } catch (e: Exception) {
                break
            }
        }

        return steps

    }
}