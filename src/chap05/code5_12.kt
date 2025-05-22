package chap05

fun main() {
    val world = "世界！"
    val message = """|
        |こんにちは,世界！
        |私は Kotlinに関して勉強しています。
        |Kotlinでは、とても簡潔なプログラムを書くことができます。
        |皆さん、一緒に楽しくプログラミングしましょう！
    """.trimMargin()

    val message2 = """
        こんにちは、世界！
        私は　Kotlinに関して勉強しています。
        Kotlinでは、とても簡潔なプログラムを書くことができます。
        皆さん、一緒に楽しくプログラミングしましょう！
    """.trimIndent()

    val message3 = """|
        |こんにちは,${world}
        |私は Kotlinに関して勉強しています。
        |Kotlinでは、とても簡潔なプログラムを書くことができます。
        |皆さん、一緒に楽しくプログラミングしましょう！
    """.trimMargin()

    println(message)
    println("----------")
    println(message2)
    println("----------")
    println(message3)
}