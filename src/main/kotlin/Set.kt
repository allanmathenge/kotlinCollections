fun main (args: Array<String>) {
    val user1 = User("Name 1")
    val user2 = User("Name 2")
    val user3 = User("Name 3")
    val user4 = User("Name 4")
    val user5 = User("Name 5")
    val user6 = User("Allan")
    val user7 = User("Allan")

    val names = setOf<User>(user1, user2, user3, user4, user5, user6, user7) // Immutable set
    val names1 = mutableSetOf<String>("Jane")

    names.forEach { println(it.name) }
}

data class User(val name: String)