package chap39

fun main() {
    // 何も省略せずにかく
    val plus1: (Double, Double) -> Double = fun(x: Double, y: Double): Double {
        return x + y
    }

    // ちょっと省略した
    val plus2: (Double, Double) -> Double = fun(x, y) = x + y

    // ラムダ式
    val plus3: (Double, Double) -> Double = {x, y -> x + y }

    println(plus1(10.0, 2.0))
    println(plus2(10.0, 2.0))
    println(plus3(10.0, 2.0))
}