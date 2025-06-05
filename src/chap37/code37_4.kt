package chap37

fun main() {

    // 無名関数
    // 関数に名前をつけない
    val p = fun(x: Double, y: Double): Double = x + y
    val m = fun(x: Double, y: Double): Double = x - y

    //関数をパラメータとしてわたす
    printRandomValuesCalculation(p)
    printRandomValuesCalculation(m)
}