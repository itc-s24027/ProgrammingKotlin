package chap11

fun main() {
    val age: Int = 14
    var message = ""

    if (age in 13..15) {
        message = "中学生です。"
    } else {
        message = "中学生ではありません。"
    }
    println(message)


//    val age: Int = 14
//
//    if (age in 13..15) {
//        var message = "中学生です。"
//    } else {
//        var message = "中学生ではありません。"
//    }
// if の中で定義された変数はブロック終了と共に使えなくなるので
// ブロック外で変数を呼び出すとエラーになる
//    println(message)

}