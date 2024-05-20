package collectionOperations

fun main() {
    val numbers = mutableListOf(2, 5, 1, 40, 20, 100, 60)
    numbers.sorted().forEach { println(it) }

    val laptop = mutableListOf(
        Laptop("Dell", 2023, 4, 600),
        Laptop("Acer220", 2020, 16, 800),
        Laptop("Apple", 2022, 8, 1000)
    )

    // Concise sorting

    println()
    laptop.sortedBy { it.year }.forEach { println(it) }
    println()
    laptop.sortedBy { it.ram }.forEach { println(it) }
    println()
    laptop.sortedBy { it.brand.length }.forEach { println(it) }
    println("\n")

    // Importance of the sortedWith()
    println("thenBy() starts here")
//    laptop.sortedWith(compareBy<Laptop> { it.year }.thenBy { it.price }).forEach { println(it) }
//    laptop.sortedWith(compareBy<Laptop>{it.ram}.thenBy { it.price }).forEach { println(it) }
//    laptop.sortedWith(compareBy<Laptop>{it.brand}.thenBy { it.price }).forEach { println(it) }

//    println("\n")

    laptop.sortedWith(compareBy<Laptop>{ it.price }.thenBy { it.year }).forEach { println(it) }
    laptop.sortedWith(compareBy<Laptop>{ it.price }.thenBy { it.ram }).forEach { println(it) }
    laptop.sortedWith(compareBy<Laptop>{ it.price }.thenBy { it.brand }).forEach { println(it) }

//    laptop.sortedWith(compareBy { it.price }).forEach { println(it) }
//    println()
//    laptop.sortedWith(compareBy { it.ram }).forEach { println(it) }
//    println()
//    laptop.sortedWith(compareBy { it.year }).forEach { println(it) }
//    println()
//    laptop.sortedWith(compareBy { it.brand.length }).forEach { println(it) }
}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int)