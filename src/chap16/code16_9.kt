package chap16

fun main() {
    val h = arrayOf(
        "こんにちは",
        "Kotlin",
        "どうぞ",
        "よろしく",
        "お願いします"
    )
    for (x in h) {
        println("String型の配列の値 = $x")
    }
}