enum class Day(val number: Int) {
    sun(1),
    mon(2),
    tue(3),
    wen(4),
    thu(5),
    fri(6),
    sat(7);

    fun getDetailView() {
        // println("Detail view")
    }
}

fun main() {
    val Sun = Day.sun
    println(Sun)

    println("Day number ${Sun.number}")
    println(Day.thu.number)

    println(Sun::class.simpleName) // the Sun object which class

    // val value = Day.sun
    // when (value) {
    //     Day.sun -> "This is sunday"
    //     Day.mon -> "This is monday"
    //     else -> "ohter day of week"
    // }
}
