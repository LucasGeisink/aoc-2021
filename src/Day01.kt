fun main() {
    fun part1(input: List<String>): Int {
        var largerThenCounter = 0
        for((index, value) in input.withIndex()) {
            if(index != 0) {
                if(input[index - 1].toInt() < value.toInt()) largerThenCounter++
            }
        }
        return largerThenCounter
    }

    fun part2(input: List<String>): Int {
        val listOfSums: MutableList<String> = mutableListOf()
        for((index, number) in input.withIndex()) {
            if(index + 2 > input.size - 1) {
                break
            }
            val sum = number.toInt() + input[index + 1].toInt() + input[index + 2].toInt()
            listOfSums.add(sum.toString())
        }

        return part1(listOfSums)
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
