fun sum(num: Int, num2: Int, callBack: () -> Unit) {
    println("sum to two numbers is : ${num+num2}")
    callBack()
}

fun cube(num: Int, callBack: (message: String) -> Unit): (number: String) -> Unit {
    println("Cube is ${num*num*num}")
    callBack("cube calculated")
    return callBack
}

fun sumAndnum(vararg nums: Int): Int { // varag function
    var sum = 0
    for (i in nums) {
        println(i)
        sum += i
    }
    return sum
}

fun main() {

    // lambda function:-
    // Learn about lambdas:-
    // Like named functions, lambdas can have parameters. For lambdas,
    //  the parameters (and their types, if needed) go on the left of what is called a function
    // arrow ->.
    // The code to execute goes to the right of the function arrow.
    //  Once the lambda is assigned to a variable, you can call it just like a function.

    val myval = { println("hi Iam lambda") }
    println(myval())

    var add = { a: Int, b: Int -> a + b }
    var sum = add(20, 10)
    println(sum)

    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 } // lambda function
    println(waterFilter(dirtyLevel))
    // ⇒ 10

    // Higher Order function:-
    val callBack = { println("the sum is completed") }
    sum(10, 20, callBack)

    val refun = cube(3) { println(it) }
    println(refun)

    // varargs:-
    var additon = sumAndnum(12, 23, 12)
    println("the sum is $additon")
}
