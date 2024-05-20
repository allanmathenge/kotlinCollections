package collectionOperations

fun main() {
    val numbers = mutableListOf("one", "two", "three", "four")

    val plusList = numbers - "three" + listOf("nine")
    println(plusList)

    val minusList = numbers + setOf("three", "four")
    println(minusList)

}