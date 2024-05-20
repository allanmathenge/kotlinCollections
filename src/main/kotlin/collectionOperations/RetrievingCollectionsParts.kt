package collectionOperations

fun main() {

    val numbers = listOf("one", "two", "three", "four", "five", "six")

    println(numbers.slice(1..3))
    println(numbers.slice(0.. 3))
    println(numbers.slice(0..4 step 2))
    println(numbers.slice(setOf(3, 5, 0)))

    // take() and drop() functions
    println(numbers.take(3))
    println(numbers.takeLast(3))
    println(numbers.drop(1))
    println(numbers.dropLast(5))

    println("\n")
    val numbers1 = listOf("one", "two", "three", "four", "five", "six")
    println(numbers1.takeWhile { !it.startsWith("f") }) // [one, two, three, six]
    println(numbers1.takeLastWhile { it == "three" }) // [three, four, five, six]
    println(numbers1.dropWhile { it.length == 3 }) // [three, four, five, six]
    println(numbers1.dropLastWhile { it.contains("t") }) // [one, two, three, four, five, six]
    println(numbers1[3])
}
