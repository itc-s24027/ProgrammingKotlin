package chap17

fun main() {
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = 4

    val y: List<Int> = listOf(1, 2, 3)
//    y[0] = 4

    // Array と List は要素を追加したり減らしたりできない
    // MutableList を使えば解決
}