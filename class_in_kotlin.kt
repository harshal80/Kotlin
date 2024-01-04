class student {
    var name: String = ""
    var rollno: Int = 0
    var div: String = ""
    fun info() {
        println("The name is : $name")
        println("The id is : $rollno")
        println("The div is : $div")
    }
}

class A {
    fun test() {
        println("test method can call in class A ")
    }
}

fun main() {

    var obj1 = A()
    obj1.test()

    val obj = student()
    obj.name = "Harshal Patil"
    obj.rollno = 173
    obj.div = "C"
    obj.info()

    val obj2 = student()
    obj2.name = "Suresh Patil"
    obj2.rollno = 111
    obj2.div = "B"
    obj2.info()
}
