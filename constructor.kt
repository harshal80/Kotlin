class Student(
        var name: String = "",
        var rollno: Int = 0,
        var div: String = ""
) // primary constructor
{

    init { // init can call when object is created . more than one init block you can creatde
        println("The name is : $name")
        println("The id is : $rollno")
        println("The div is : $div")
    }
}

class car {
    // secondary constructor is declare with constructor keyword
    // more than one secondary constructor allow to creted when argument can diffreant
    var carmodel = ""
    var carcolor = ""
    constructor(model: String, color: String) {
        carmodel = model
        carcolor = color
        println("creating car object with $model, $color")
    }

    // constructor(model: String, color: String) : this(model, color, price = 0) {
    //     println("First constructor")
    // }

    var carprice = 0
    constructor(model: String, color: String, price: Int) {
        carmodel = model
        carcolor = color
        carprice = price
        println("creating car object with $model, color: $color , price: $price")
    }
}

fun main() {
    var obj = Student("harshal", 173, "A")
    var obj2 = car("CAR ABC", "blue")
    var obj3 = car("CAR ABC", "blue", 50000)
    println(obj2.carmodel)
    println(obj2.carcolor)
}
