fun main() {
    fun part1(input: List<String>): Int {
        var horizontalPosition = 0
        var depth = 0

        for(number in input) {
            val instruction = number.split("\\s".toRegex())[0]
            val distance = number.split("\\s".toRegex())[1].toInt()
            when(instruction) {
                "forward" -> horizontalPosition += distance
                "up" -> depth -= distance
                "down" -> depth += distance
            }
        }
        return depth * horizontalPosition
    }

    fun part2(input: List<String>): Int {
        var horizontalPosition = 0
        var depth = 0
        var aim = 0

        for(number in input) {
            val instruction = number.split("\\s".toRegex())[0]
            val distance = number.split("\\s".toRegex())[1].toInt()
            when(instruction) {
                "forward" -> {
                    horizontalPosition += distance
                    depth += distance * aim
                }
                "up" -> aim -= distance
                "down" -> aim += distance
            }
        }
        return depth * horizontalPosition
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
