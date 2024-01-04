// you can create dada class then the primeary construnctor nedds at least one parameter.
// Data classes cannot be abstract ,open ,scaled or inner.file
// Data classes may nonly implement interfaces.
data class Person(var name: String, var age: Int) {}

fun main() {
    val person1 = Person("harshal", 18)
    println(person1.age)
    println(person1.name)
    val person1Copy = person1.copy()
    println(person1Copy.age)
    println(person1Copy.name)
    println()
    person1Copy.name = "patil"
    println(person1.name)
    println(person1Copy.name)

    println("------------------")
    println(
            person1
    ) // auto matic two string method can call  only data class can provide this method
    println(
            person1Copy
    ) // auto matic two string method can call only data class can provide this method
}
