package chap07

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(0, 100)
    // a が 0〜59  なら D
    // a が 60〜69 なら C
    // a が 70〜79 なら B
    // a が 80〜89 なら A
    // a が 90〜   なら S
    // を a の値とともに出力してください


    //自分の解答
//    if (a >= 0 && a <= 59) {
//        println("D")
//    }
//    else if (a >= 60 && a <= 69) {
//        println("C")
//    }
//    else if (a >= 70 && a <= 79) {
//        println("B")
//    }
//    else if(a >= 80 && a <= 89) {
//        println("A")
//    }
//    else {
//        print("S")
//    }

    // 先生の解答
    if (a < 60) {
        println("$a : D")
    }
    else  if (a < 70) {
        println("$a : C")
    }
    else if (a < 80) {
        println("$a : B")
    }
    else if (a < 90) {
        println("$a : A")
    }
    else {
        println("$a : S")
    }
}