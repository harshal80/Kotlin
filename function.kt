fun printHello() {
    println("Hello World")
}

// paramiter passing function

fun add(a: Int = 10, b: Int = 10): Int { // defolt argument function
    val sum = a + b
    return sum
}

fun fishFood(day: String): String {
    var food = ""
    when (day) {
        "Monday" -> food = "Samosa"
        "Tuesday" -> food = "pavbaji"
        "Wednesday" -> food = "chole"
        "Thursday" -> food = "Paneer"
        "Friday" -> food = "Mutter Paneer."
        "Saturday" -> food = "dhosa"
        "Sunday" -> food = "vdapav"
    }
    return food
}

fun fact(x: Int): Int { // recurtion in kotlin
    if (x == 0 || x == 1) {
        return 1
    } else {
        return x * fact(x - 1)
    }
}

fun main() {

    printHello()
    println(add(20, 10))

    val day = "Monday"
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    // filter functio
    var decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println(
            decorations.filter { it[0] == 'r' }
    ) // filter function can filter the opration you can parporm it and retunr

    // Compare eager and lazy filters:-
    // In Hello.kt, change your code to assign the filtered list to a variable called eager, then
    // print it.
    var decorations1 = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, creates a new list
    val eager = decorations1.filter { it[0] == 'p' }
    println("eager: $eager")

    // Below that code, evaluate the filter using a Sequence with asSequence().
    // Assign the sequence to a variable called filtered, and print it.

    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    // map() function:-

    val listOfNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var transformedList = listOfNumbers.map { it * 2 }
    println(transformedList)
    val listOfNumbers1 = listOf(1, 2, 3, 4, 5)
    val map = listOfNumbers1.mapIndexed { index, it -> it * index }
    println(map)

    println("Enter the number: ")
    var num = readln().toInt()
    println("the factorial is: " + fact(num))
}
