package dk.jamiemagee.advent2017

class Day4(private val input: List<String>) {
    fun partOne(): Int {
        return input.map { it -> it.split(' ').toSet().size == it.split(' ').toList().size }
                .sumBy { if (it) 1 else 0 }
    }

    fun partTwo(): Int {
        return input.map { it ->
            val splitInput = it.split(' ')
            splitInput.toSet().size == splitInput.toList().size &&
                    splitInput.map { it.toCharArray().sorted().toString() }
                            .toSet().size == splitInput.toSet().size
        }
                .sumBy { if (it) 1 else 0 }
    }
}