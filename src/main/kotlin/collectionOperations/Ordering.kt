package collectionOperations
fun main() {
    val numbers = mutableListOf(2, 5, 1, 40, 20, 100, 60)
    numbers.sorted().forEach { println(it) }
    println()

    val laptops = mutableListOf(
        Laptop5("Apple", 2021, 16, 1000),
        Laptop5("dell2022", 2022, 4, 600),
        Laptop5("Acer", 2023, 8, 800),
    )
    println()
    laptops.sorted().forEach { println(it) }

    println()
    laptops.sortedWith(ComparatorRam()).forEach { println(it) }

    println()
    laptops.sortedWith(ComparatorYear()).forEach { println(it) }

    println()
    laptops.sortedWith(ComparatorBrandLength()).forEach { println(it) }
}

data class Laptop5(val brand: String, val year: Int, val ram: Int, val price: Int) : Comparable<Laptop5> {
    override fun compareTo(other: Laptop5): Int {
        return if (this.price > other.price) {
            println("In if statement: Swapping ${this.brand} with ${other.brand}")
            1
        } else if (this.price < other.price) {
            println("In if statement: Swapping ${this.brand} with ${other.brand}")
            -1
        } else {
            0
        }
    }
}

class ComparatorRam : Comparator<Laptop5> {
    override fun compare(laptop1: Laptop5, laptop2: Laptop5): Int {
        return if(laptop1.ram > laptop2.ram) {
            1
        } else if (laptop1.ram < laptop2.ram) {
            -1
        } else {
            0
        }
    }
}

class ComparatorYear: Comparator<Laptop5> {
    override fun compare(laptop1: Laptop5, laptop2: Laptop5): Int {
        return if (laptop1.year > laptop2.year) {
            1
        } else if (laptop1.year < laptop2.year) {
            -1
        } else {
            0
        }
    }
}

class ComparatorBrandLength : Comparator<Laptop5> {
    override fun compare(laptop1: Laptop5, laptop2: Laptop5): Int {
        return if (laptop1.brand.length > laptop2.brand.length) {
            1
        } else if (laptop1.brand.length < laptop2.brand.length) {
            -1
        } else {
            0
        }
    }
}
