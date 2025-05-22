package chap50

fun main() {
    // rangeやlistなどはforEachを使う
    val a = listOf(
        "こんにちは", "kotlin", "どうぞ", "よろしく"
    )

    println("forEach 使う方法1")
    a.forEach { println(it) }

    println("forEach 使う方法2")
    a.forEach (::println)
}