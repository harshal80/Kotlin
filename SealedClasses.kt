// sealed class abstract by defolt you can created object in sealed calls
// sealed class constructor are private by defolt

sealed class Ball

class RedBall(val color: String = "red") : Ball() {}

class GreenBall(val color: String = "green") : Ball() {}

class BlueBall(val color: String = "blue") : Ball() {}

fun main() {
    val value: Ball = RedBall()

    when (value) {
        is RedBall -> println("This is red ball")
        is BlueBall -> println("This is blue ball")
        is GreenBall -> println("This is green ball")
    }
}
