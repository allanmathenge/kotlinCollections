fun main(args: Array<String>) {
    val users = listOf<String>("Name 1", "Name 2", "Name 3", "Name 3") // Immutable list
    println(users)

    val names = mutableListOf("Name 1", "Name 2", "Name 3") // Mutable List
    names.add("Name 4")
    names.removeAt(0)
    names.remove("Name 2")

    names.forEach { println(it) }
}
