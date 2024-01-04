fun main() {
    println("for loop :-") // for loop in given range

    var element = arrayOf("Apple", "ball", "cat", "dog", "eye") // travarsing array in for loop
    for (i in element) {
        println(i.reversed())
        println(i)
    }

    val school = arrayOf("shark", "salmon", "minnow")
    for (element in school) {
        print(element + " ")
    }
    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }

    // onlinear for loop
    for (i in 1..5) print(i)
    // ⇒ 12345
    println()
    for (i in 5 downTo 1) print(i)
    // ⇒ 54321
    println()
    for (i in 3..6 step 2) print(i)
    // ⇒ 35
    println()
    for (i in 'a'..'z') print(i)
    // ⇒ a to z to print

    println()

    for (i in 1..10) {
        println(i)
    }

    println()

    for (i in 10 downTo 1) {
        println(i)
    }

    println()

    for (i in 0..50 step 2) {
        println(i)
    }

    println()

    for (i in 1 until 10) {
        println(i)
    }

    println()

    println("While loop:- ")
    var i = 0
    while (i < 10) {
        println(i)
        i += 1
    }

    println("do while loop:- ")

    do {
        println(i)
        i++
    } while (i <= 20)
}
