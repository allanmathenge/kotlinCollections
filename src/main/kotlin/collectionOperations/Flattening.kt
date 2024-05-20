package collectionOperations

fun main() {
    val numbersSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
//    for(numbers in numbersSets) {
//        for (number in numbers) {
//            println(number)
//        }
//        println("\n")
//    }


//  converts two-dimensional arrays to one. List<Set<Int>> -->> List<Int>

    val numbersFlattened = numbersSets.flatten()
//    println(numbersFlattened[8])

    for (number in numbersFlattened) {
        println(number)
    }
}