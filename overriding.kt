open class One {
    open val s: String = "harshal"
    open fun display() {
        println("Hi am $s")
    }
}

class Second : One() {
    override var s = "harsh"
    override fun display() {
        super.display() // super key word can first call to prent calls funtion then call child
        // class
        println("Hi overwide $s")
    }
}

fun main() {

    // val obj=One()
    // obj.display()

    val obj2 = Second()
    obj2.display()
}
