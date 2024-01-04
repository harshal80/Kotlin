abstract class Animal {
    // concreate method: concreate method means function wthi body
    abstract val color: String
    fun eat() {
        println("Animal is eating ")
    }

    // abstract method :- abstract method means withot body to a function
    abstract fun speak()
}

class cat : Animal() {
    override val color: String = "Black"

    override fun speak() {
        println("cat is speaking;")
    }
}

fun main() {

    val obj = cat()
    obj.eat()
    obj.speak()
}
