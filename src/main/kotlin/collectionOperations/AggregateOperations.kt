package collectionOperations

fun main() {
    val numbers = listOf(6, 10, 14, 4, 100)
    println("The sum = ${numbers.sum()}")
    println("The count = ${numbers.count()}")
    println("The average = ${numbers.average()}")
    println("The max value = ${numbers.maxOrNull()}")
    println("The min value = ${numbers.minOrNull()}")

    // Advanced sum function -> sumOf()
    println("The sum = ${numbers.sumOf { it * 2 }}")

}
