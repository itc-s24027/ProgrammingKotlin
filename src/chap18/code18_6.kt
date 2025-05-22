package chap18

fun main() {
    // コード18.5
    val x = mutableListOf("あ", "い", "う", "え", "お")
    println(x)
    x += "あ"
    x += "あ"
    x += "あ"
    println("コレクション内の要素数： ${x.count()}")
    println(x)
    println("---------")

    // コード18.6
    val y = mutableSetOf("あ", "い", "う", "え", "お")
    println("コレクション内の要素数： ${y.count()}")
    println(y)
    y += "あ"
    y += "あ"
    y += "あ"
    println("コレクション内の要素数： ${y.count()}")
    println(y)
}