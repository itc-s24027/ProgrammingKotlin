package chap17

fun main() {
    val a = mutableListOf(1, 2, 3, 4, 5)
//  val a: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5) // 上と一緒

    // 空の mutableList を作る
//  val b = mutableListOf() // だめ
    val b: MutableList<Int> = mutableListOf() // ok
    val c = mutableListOf<Int>() // ok
}