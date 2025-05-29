package exam01

/**
 * お釣りの金種計算
 * ランダムで 100 〜 9000 の数値を生成します。
 * 支払う金額をキーボードから入力します。
 * お釣りを計算して、金種ごとにその枚数を出力してください。
 * トータルの枚数は最小となる組み合わせでお釣りを返します。
 * 支払う金額が足りない場合は、「足りません」と出力してください。
 */

import kotlin.random.Random

fun main() {
    val kinsyulist = listOf(10000, 5000, 1000, 500, 100, 50, 10, 5, 1)
    val price = Random.nextInt(100,9000)
    println("価格：$price")
    print("支払う金額を入力してください:")
    val pay = readln().toInt()
    var oturi = pay - price

    if (price >= pay) {
        println("支払う金額が足りません")
    } else {
        println("お釣り： $oturi 円")
    }

    for (kinsyu in kinsyulist) {
        val count = oturi / kinsyu
        oturi %= kinsyu
        if (count > 0) {
            println("${kinsyu}円:${count}枚")
        }
    }
}