package dk.jamiemagee.advent2017

class Day10(private val input: String) {

    private val splitInput = try {
        input.split(',').map(String::toInt)
    } catch (e: NumberFormatException) {
        emptyList<Int>()
    }

    fun partOne(): Int {
        val (first, second) = hash(splitInput, 1)
        return first * second
    }

    fun partTwo(): String {
        val lengths = input.map(Char::toInt) + listOf(17, 31, 73, 47, 23)
        val hash = hash(lengths, 64)
        return hash.asIterable()
                .chunked(16) { it.fold(0) { acc, next -> acc xor next } }
                .joinToString("") { it.toString(16).padStart(2, '0') }
    }

    private fun hash(lengths: List<Int>, rounds: Int): IntArray {
        val list = IntArray(256) { it }
        var currentPosition = 0
        var skipSize = 0

        repeat(rounds) {
            lengths.forEach { length ->
                list.reverse(currentPosition, length)
                currentPosition += length + skipSize
                currentPosition %= list.size
                skipSize++
            }
        }

        return list
    }

    private fun IntArray.reverse(start: Int, length: Int) {
        var startPointer = start % this.size
        var endPointer = (start + length - 1) % this.size

        repeat(length / 2) {
            val tmp = this[startPointer]
            this[startPointer] = this[endPointer]
            this[endPointer] = tmp
            startPointer++
            endPointer--
            if (startPointer >= this.size) startPointer = 0
            if (endPointer < 0) endPointer = this.size - 1
        }
    }
}
