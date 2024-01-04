fun calculateArea(shpae: Shape) {
    shpae.findArea()
}

open class Shape {

    open fun findArea() {

        println("finding area of shape")
    }
}

class Circle : Shape() {

    override fun findArea() {
        println("find area of circle")
    }
}

class Rectangle : Shape() {
    override fun findArea() {
        println("finding area of rectangle")
    }
}

fun main() {

    var shape = Rectangle()
    calculateArea(shape)
}
