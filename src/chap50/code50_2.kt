package chap50

fun main() {
    // code13_2 を置き換えてみる
    val x = 5
    (1..9).forEach {
        println("${x}かける${it}は ${x * it} です。")
    }
}