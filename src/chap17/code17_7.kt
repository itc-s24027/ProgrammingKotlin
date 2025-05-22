package chap17

fun main() {
    val a: MutableList<String> = mutableListOf("こんにちは", "Kotlin", "よろしく")
    for ((i, x) in a.withIndex()) {
        println("$i : $x")
    }
    println("--------")
    a.add(2,"どうぞ") // index と 要素
//    a.add("お願いします")
    a += "お願いします" // add と同じ動きをする
    for ((i, x) in a.withIndex()) {
        println("$i : $x")
    }
}