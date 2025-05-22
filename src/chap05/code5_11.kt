package chap05

fun main() {
    val h: Int = 8
    val message = "本日働いた時間は、${h}hours"
    val message2 = "このペースで１ヶ月毎日働くと、${h * 30}hoursの労働になります。"
    val message3 = "このペースで１年間毎日働くと、${h * 365}hoursの労働になります。"
    println(message)
    println(message2)
    println(message3)
}