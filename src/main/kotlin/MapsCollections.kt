fun main(args: Array<String>) {
    val names = mapOf<Int, String>(1 to "Maria", 2 to "Allan", 3 to "John")
    println(names[1])

    val users = mutableMapOf<Int, String>(1 to "Maria", 2 to "Allan", 3 to "John")

    users[5] = "Mathenge"
    users.remove(3)

    users.forEach{ (t, u) ->
        println("$t and $u")
    }
}