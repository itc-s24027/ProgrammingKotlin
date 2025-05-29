package exam01

/**
 * キーボードから数字を入力して、1から入力された数までの
 * FizzBuzz を出力します。(数字以外は入力されない前提でok)
 *
 * FizzBuzz とは、
 * 3の倍数のときに Fizz
 * 5の倍数のときに Buzz
 * 3と5の倍数のときに FizzBuzz
 * それ以外のときは　数字をそのまま出力する
 * よくあるプログラムの練習です。
 */
fun main() {
    print("数字を入力してください:")
    val x: Int = readln().toInt()
//    for (i in 1..x) {
//        if (i % 3 == 0 && i % 5 == 0) {
//            println("FizzBuzz")
//        } else if (i % 3 == 0) {
//            println("Fizz")
//        } else if (i % 5 == 0) {
//            println("Buzz")
//        } else {
//            println("$i")
//        }
//    }

//    (1..x).forEach {
//        if (it % 3 == 0 && it % 5 == 0) {
//            println("FizzBuzz")
//        } else if (it % 3 == 0) {
//            println("Fizz")
//        } else if (it % 5 == 0) {
//            println("Buzz")
//        } else {
//            println("$it")
//        }
//    }

    (1..x).forEach {
        val result = if (it % 15 == 0) {
            "FizzBuzz"
        } else if (it % 5 == 0) {
            "Buzz"
        } else if (it % 3 == 0) {
            "Fizz"
        } else {
            it.toString()
        }
        println(result)
    }
}