package chap35

class Person2(val name: String, val mynumber: Int) {
    override fun equals(other: Any?): Boolean {
        if (other != null
            && other is Person2
            && this.name == other.name
            && this.mynumber == other.mynumber
        ) {
            return true
        }
        return false
    }
}

fun main() {
    val p1 = Person2("たけし", 1234)
    val p2 = Person2("たけし", 1234)
    println("p1のハッシュコード： ${p1.hashCode()}")
    println("p2のハッシュコード： ${p2.hashCode()}")

    if (p1 == p2) {
        println("二人は同一人物")
    } else {
        println("二人は別人")
    }
}