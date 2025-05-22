package chap21

fun main() {
    val answer = getThreeTimes(5)
    // 関数で方をint型として指定してるので自然とint型になる
    println(answer)
}

fun getThreeTimes(value: Int): Int {
    return value * 3
}