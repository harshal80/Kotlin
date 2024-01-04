fun main() {
    println("Enter the number: ")
    val age = readln().toInt()
    val number = 20

    if (number in 1..100) { // check the number can present up to 1 to 100
        println("Number is present ")
    } else {
        println("number can not prsent ")
    }

    if (age > 18) {
        println("abble to vote ")
    } else if (age == 18) {
        println("your age is 18 ")
    } else {
        println("not abble to vote")
    }

    // onlinar if else:-

    var temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    temperature = 10
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)

    println("Enter the number to check out the when block: ")
    val num = readln().toInt()
    // when (num) { // when is is control statement as similar to shich case statement
    //     0 -> println("the number is 0")
    //     10 -> println("the number is 10")
    //     in 1..20 -> println("number is 1 to 20")
    //     else -> println("number can not match to when condition ")
    // }

    val grade: Char =
            when (num) {
                in 91..100 -> 'A'
                in 81..90 -> 'B'
                in 71..80 -> 'C'
                else -> 'F'
            }
    println(grade)
}
