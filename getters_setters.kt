class user1 {
    var userid: String = "defoltid"
        // get()=field
        get() {
            println("getting value")
            return field
        }
        set(value) {
            println("setting value")
            if (value.isEmpty()) {
                println("inbalid value for userid ")
            }
            field = value
        }
    var userName: String = ""
        set(value) {
            field = value
        }
        get() = field // field is keyword
}

fun main() {
    val obj = user1()
    println(obj.userid) // getter call

    obj.userid = "harshal" // setter call
}
