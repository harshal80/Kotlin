// public means visible outside the class. Everything is public by default, including variables and
// methods of the class.
// internal means it will only be visible within that module. A module is a set of Kotlin files
// compiled together, for example, a library or application.
// private means it will only be visible in that class (or source file if you are working with
// functions).
// protected is the same as private, but it will also be visible to any subclasses.

class mod {
    private var username: String = ""
    fun display() { // by defolt public mod can apply to method or varible
        println("username")
    }
}

fun main() {
    var obj = mod()
    // obj.username
    obj.display()
}
