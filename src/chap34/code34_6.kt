package chap34

import kotlin.math.sqrt

fun main() {
    val number1 = null
    val number2 = 10

    printCubicSquareRoot(number1)
    printCubicSquareRoot(number2)
}
fun printCubicSquareRoot(num: Int?) { //null許容型
    if (num == null) {
        println("null なのでなにもしない")
        return //nullならここで終わる
        //elseを使って書くこともできるが
        //この条件は何もしない　という時にこの書き方をすると良い
    }
    val result = sqrt((num * num * num).toDouble())
    println("${num}を3乗した数の平方根は${result}です。")
}