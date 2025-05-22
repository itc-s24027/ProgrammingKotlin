package chap11

import kotlin.random.Random

fun main() {
    val score = Random.nextInt(0,100)
    val borderC = 60
    val borderB = 70
    val borderA = 80
    val borderS = 90
    val judge = if (score in 0..<borderC) {
        "score ${score}: D"
    } else if (score in borderC..<borderB) {
        "score ${score}: C"
    } else if (score in borderB..<borderA) {
        "score ${score}: B"
    } else if (score in borderA..<borderS) {
        "score ${score}: A"
    } else {
        "score ${score}: S"
    }
    println(judge)
}