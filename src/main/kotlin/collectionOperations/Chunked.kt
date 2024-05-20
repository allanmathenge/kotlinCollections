package collectionOperations

fun main() {

    val numbers = (0..13).toList()

    println(numbers.chunked(3))

    // Transformation of the chunked collections

    println(numbers.chunked(3) {
        it.sum()
    })

    // Windowed function
    val numbersString = listOf("one", "two", "three", "four", "five", "six", "seven")
    println(numbersString.windowed(3))
}