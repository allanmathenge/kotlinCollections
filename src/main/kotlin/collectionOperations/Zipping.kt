package collectionOperations

fun main() {

    // ZIPPING functions

    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")

    // println(colors.zip(animals))
    // println(colors zip animals)

    println(colors.zip(animals) { t, u -> "The ${u.replaceFirstChar { it.uppercase() }} is $t"})

    val numbers1 = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numbers1)
    println(numbers1.unzip())

}