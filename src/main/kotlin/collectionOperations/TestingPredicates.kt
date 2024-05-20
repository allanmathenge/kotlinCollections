package collectionOperations

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.any { it.endsWith("e") })
    println(numbers.none { it.endsWith("w") })
    println(numbers.all { it.length > 1 })
}
