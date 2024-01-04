fun main() {

    // Arithmetic Operators: +,-*,/,%

    var a = 30
    var b = 20
    println("addtion is ${a+b}")
    println("subtraction is ${a-b}")
    println("Multiplication is ${a*b}")
    println("divison is ${a/b}")
    println("mod is ${a%b}")

    // comparison operator: ==, != , < ,> ,<= , >=

    println("a==b is ${a==b}")
    println("a!=b is ${a!=b}")
    println("a<b is ${a<b}")
    println("a>b is ${a>b}")
    println("a<=b is ${a<=b}")
    println("a>=b is ${a>=b}")

    // Logical operator: && , || , !

    if (a > b && b < a) { // tow condion is trune the if block executed
        println("message will be print")
    }
    if (a > b || b > a) { // one  condion is trune the if block executed
        println("2message will be print")
    }

    // Assignment Operators: =,+=,-=,*=,%=

    a = 5
    a += 10
    a -= 5
    a *= 2
    a %= 3
}
