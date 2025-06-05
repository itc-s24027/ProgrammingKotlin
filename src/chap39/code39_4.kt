package chap39

import kotlin.math.acos

fun main() {
    val list = listOf("a", "b", "c", "d", "e", "f")

    //(1)
    val action: (String) -> Unit = fun(x) {
//    val action = fun(x: String) { 上と同じ
        println("1:$x")
    }
    list.forEach(action)

    //(2)
    list.forEach { println(it) }
    //for文の場合
    for (it in list) {
        println(it)
    }
}