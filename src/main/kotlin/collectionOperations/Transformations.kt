package collectionOperations

fun main() {
    val numbers = setOf(1, 2, 3, 4, 5)
    println(numbers.map { if (it == 3) it * 100 else it * 5 })

    // MAPS key-value pairs

    val numbersMap = mapOf("key 1" to 1, "Key 2" to 2, "key 3" to 3, "key 4" to 4)
    println(numbers.mapIndexedNotNull { index, value -> if (index == 0) null else index * value })

    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues { it.key.length + it.value })

}