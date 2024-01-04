// user defind data type (class):-

class user(val name: String, val phone: Long, val addres: String) {

    fun display() {
        println("name is : $name")
        println("phone is : $phone")
        println("addres is : $addres")
    }
}

fun main() {

    // All data type are object in class in kotlin (non primtive)

    // integer number data type :-
    val number1: Int = 34 // integer tipe data store in
    val number2: Byte = 12 // byte of number can store in spaicpic range
    val number3: Short = 56 // short number can store
    val number4: Long = 3333333333333 // long interger number can store
    println("number1 is  $number1")
    println("number2 is  $number2")
    println("number3 is  $number3")
    println("number4 is  $number4")

    // typecasting in kotlin :-

    // floating number data type:-
    val float1: Float = 20.12F // you don't write a last ( F ) by defolt cansider double
    val double2: Double = 20.20200 // double can store long pointing value

    println("the flotat1 is : $float1")
    println("the double2 is : $double2")

    // charter data type :-

    val char1: Char = 'H'
    println("the char1 is : $char1")

    // Boolean dadatype :
    val bool1: Boolean = true
    println("the bool1 is : $bool1")
    val bool2: Boolean = false
    println("the bool2 is : $bool2")

    // string data type : string is collection of charter :-

    val str1: String = "Hi Iam Harshal What about you "
    println(str1)

    // array data type :-

    var arr1: Array<String> = arrayOf("Harshal", "Dnyaneshwar", "Patil")
    println(arr1[0])

    var arr = arrayOf(1, 2, 3, 4, 5)
    println(arr[1])
    arr[1] = 20

    println(arr[1])
    for (i in arr) {
        println(i)
    }

    // User defind data type
    val obj = user("name", 8010070139, "Shirpur")
    obj.display()
}
