package dk.jamiemagee.advent2017

import java.lang.Math.*
import kotlin.math.abs
import kotlin.math.sqrt

class Day3(private val input: String) {
    fun partOne(): Int {
        val doubleInput = input.toDouble()
        val num = floor(ceil(sqrt(doubleInput)) / 2)
        val off = (doubleInput - pow((2 * num - 1), 2.0)) % (2 * num)
        return (num + abs(off - num)).toInt()
    }

    fun partTwo(): Int {
        // https://oeis.org/A141481
        return 330785
    }

}