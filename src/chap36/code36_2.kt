package chap36

fun main() {
    val p = Person2()
    p.greet()
}

class Person2 {
    val name = "名無しさん"
    val age = 0
    fun greet() {
        val name = "ヒロシ"
        val age = 46
        println("${name}です。 ${age}才です。")
    }
}