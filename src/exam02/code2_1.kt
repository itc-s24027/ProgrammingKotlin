package exam02

import kotlin.random.Random
fun main() {
//    println(Random.nextInt(1, 10))
    val d1 = Dice("普通のサイコロ")
}
class Dice(val name: String, var maxNumber: Int = 6) {
    var number: Int = 1;
    init {
        roll()
    }

    fun roll() {
        number = Random.nextInt(1, maxNumber+1)
        println("サイコロの目の最大値は${maxNumber}です。")
        println("${name}の出目は${number}です")
    }
}

// Dice という名前でサイコロを表すクラスを定義してください
// 一般的な6面サイコロ以外も対応したいので、いくつまでの数を出せるか
// コンストラクタでパラメータとして受け取れるようにしてください。
//
// 持っているプロパティ
//  - name      => 識別用
//  - number    => 今の出目
//  - maxNumber => このサイコロの目の最大値
// メソッド
//  - roll  => サイコロを振る。
// ※ 乱数生成　-> Random.nextInt()
// プロパティとして識別用の名前(name)を持ちます
// roll というメソッドでサイコロを振ります。
// でた目は number というプロパティで繰り返し参照できること。
