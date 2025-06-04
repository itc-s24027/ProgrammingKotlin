package chap36

fun main() {
    val p = Person()
    p.setNameandAge("たけし", 5)
    p.greet()
}

class Person {
    var name = ""
    var age = 0

    fun setNameandAge(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun greet() {
        println("${name}です。 ${age}才です。")
    }
}