package collectionOperations

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.groupBy { it.first().uppercase() })
    println(numbers.groupBy(keySelector = { it.first().uppercase() }, valueTransform = { it.replaceFirstChar { it.uppercase() } }))

}
