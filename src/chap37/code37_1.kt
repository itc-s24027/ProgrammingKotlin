package chap37

import kotlin.random.Random
fun main() {
    val p = ::calculatePlus
    val m = ::calculateMinus
    //関数をパラメータとしてわたす
    printRandomValuesCalculation(p)
    printRandomValuesCalculation(m)
}

fun calculatePlus(x: Double, y: Double) = x + y
fun calculateMinus(x: Double, y: Double) = x - y

fun printRandomValuesCalculation(calculator: (Double, Double) -> Double) {
    val x = Math.random()
    val y = Math.random()
    val result = calculator(x,y)
    println("計算結果は${result}です。")
}