package dk.jamiemagee.advent2017


class Day8(private val input: List<String>) {

    private val comparisons = mapOf(
            "==" to { x: Int, y: Int -> x == y },
            "!=" to { x, y -> x != y },
            ">" to { x, y -> x > y },
            "<" to { x, y -> x < y },
            ">=" to { x, y -> x >= y },
            "<=" to { x, y -> x <= y }
    )

    private val commands = mapOf(
            "inc" to { x: Int, y: Int -> x + y },
            "dec" to { x, y -> x - y }
    )

    private val registers = mutableMapOf<String, Int>()

    private var highest = 0

    fun partOne(): Int {
        return registers.maxBy { it.value }!!.value
    }

    fun partTwo(): Int {
        return highest
    }

    init {
        input.stream().forEach {
            val (register, command, amount, _, testRegister, comparison, testAmount) = it.split(" ")
            registers.putIfAbsent(register, 0)
            if (comparisons[comparison]!!.invoke(registers.getOrDefault(testRegister, 0), testAmount.toInt())) {

                val current = registers[register]
                registers.put(register, commands[command]!!.invoke(current!!, amount.toInt()))
                if (registers[register]!! > highest) {
                    highest = registers[register]!!;
                }
            }
        }
    }
}