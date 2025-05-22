package chap12

import kotlin.properties.ReadOnlyProperty
import kotlin.random.Random

fun main() {
    val x = Random.nextInt(1,5)
    when (x) {
        1,2 -> println("${x}:ワンかツーのどちらかです")
        3 -> println("${x}:スリー")
        else -> println("${x}:ワン、ツー、スリー以外の数字です")
    }
}