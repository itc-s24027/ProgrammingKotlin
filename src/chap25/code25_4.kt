package chap25

fun main() {
    val p2 = Person("タケシ", 5)
    p2.greet()
    val p3 = Person(name = "ユミ") //名前だけ渡すこともできる
    p3.greet()
    val p4 = Person(age = 7) //年齢だけ渡すこともできる（名前は名無しになる）
    p4.greet()
    val p5 = Person(age = 9, name = "マイ") //逆で書くこともできる
    p5.greet()
}
class Person (val name: String = "名無しさん", var age: Int = 0) {
    fun greet() {
        println("${name}です。${age}です。")
    }

}