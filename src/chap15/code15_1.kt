package chap15

import kotlin.random.Random
fun main() {
    while (true) {
        val value = Random.nextInt(until = 100) //100未満
//        println("乱数： $value") // 10未満の数字は表示される
        if (value < 10) break //{}を省略するときは（）の後ろにbreakを書くこと
        println("乱数： $value") // 10未満の数字は表示されない
    }
}