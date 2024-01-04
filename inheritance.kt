open class base {

    var x: Int = 10
    fun displayx() {
        println("x is $x")
    }
}

open class dervied : base() { // single level inheritance can parform
    var y = 50
    fun displayy() {
        println("y is $y")
    }
}

class dervied2 : dervied() { // multilevel inheritance

    var z = 40
    fun displayz() {
        println("z is $z")
    }
}

fun main() {

    val obj1 = dervied2()
    obj1.displayx()
    obj1.displayy()
    obj1.displayz()
}
