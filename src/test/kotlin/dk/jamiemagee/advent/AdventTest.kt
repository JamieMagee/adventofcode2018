package dk.jamiemagee.advent

open class AdventTest(var year: Int = 0, var day: Int = 0) {
    fun printPartOne(input: Any) = println("${this.year} Day ${this.day} part 1: ${input}")

    fun printPartTwo(input: Any) = println("${this.year} Day ${this.day} part 2: ${input}")
}
