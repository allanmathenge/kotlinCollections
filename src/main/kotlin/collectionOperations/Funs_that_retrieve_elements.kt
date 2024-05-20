package collectionOperations

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five", "six", "seven")
    println(numbers.elementAt(3)) // [four]
    println(numbers.first()) // [one]
    println(numbers.last()) // [seven]

    // Retrieving elements by condition

    println(numbers.first { it.length > 3 }) // [three]
    println(numbers.last { it.startsWith("s") }) // [three]
    println(numbers.random()) // [return random value]
    println(numbers.isEmpty()) // [false]
    println(numbers.isNotEmpty()) // [true]

}