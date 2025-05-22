package chap12

import kotlin.random.Random

fun main() {
    // chap11_13をwhenでかきなおした
    val score = Random.nextInt(50,100)
    val borderC = 60
    val borderB = 70
    val borderA = 80
    val borderS = 90
    val judge = when (score) {
        in 0..<borderC       -> "score ${score}: D"
        in borderC..<borderB -> "score ${score}: C"
        in borderB..<borderA -> "score ${score}: B"
        in borderA..<borderS -> "score ${score}: A"
        else                    -> "score ${score}: S"
    }
    println(judge)
}