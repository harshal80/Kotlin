interface MyInter {
    val p1: String // can not provide directly value
    fun m1() // by defolt its abstract mehtod
    fun m2() {
        println("this is interface m2 method ")
    }
}

class Child1 : MyInter {

    override val p1: String
        get() = "this is child property"

    override fun m1() {
        println("this is m1 of child class")
    }
}

fun main() {

    val inter = Child1()
    inter.m1()
    inter.m2()
    println(inter.p1)
}
