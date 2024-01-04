import java.util.ArrayList as subList // as use also alias

typealias dkset = HashSet<String> // typealias is keyword

fun main() {
    val ob: Any = "Sting"
    // as key word:-
    val strOb: String = ob as String // as key word is use  to type casting
    if (strOb is String) { // (is) is the keyword to check conditon
        println(strOb.length)
    }
    val lsit = subList<String>()
    lsit.add("harshal")
    lsit.add("Dnyaneshwar")
    lsit.add("Patil")
    println(lsit)

    // in operator:-
    for (i in lsit) {
        println(i)
    }

    val set = dkset()
    set.add("H")
    set.add("A")
    set.add("R")
    set.add("S")
    set.add("HA")
    set.add("L")

    println(set)
}
