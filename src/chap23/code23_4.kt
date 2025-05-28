package chap23

fun main() {
    val p = Person() // インスタンス生成 javaではnewをつけていたが、kotlinではつけない
    p.name = "たけし"
    p.age = 5
    p.greet()
}

// クラス Person
class Person {
    var name: String = ""
    var age: Int = 0

    // メソッド greet
    fun greet() {
        println("こんにちは、私の名前は ${name}です。年齢は ${age}歳えす。")
    }
}