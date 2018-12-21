package dk.jamiemagee.advent

open class TestInput: AdventTest() {

    private val numberRegex = "[^0-9]".toRegex()

    val input: String

    init {
        val pair = this::class.qualifiedName!!
                .split(".")
                .takeLast(2)
                .map { it.replace(numberRegex, "") }
                .map { it.toInt() }
        this.year = pair[0]
        this.day = pair[1]
        this.input = resourceAsString(this.year, this.day)
    }
}
