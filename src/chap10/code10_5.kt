package chap10

fun main() {
    val rangeE = 0..10 // 10を含む
    val rangeA = 0..< 10  // ..< で10を含まない
    val max = 5
    val rangeB = 0..< max
    val rangeC = 0..max -1 // max-1で５を含まない

    println("10 in rangeE: ${10 in rangeE}")
    println("9 in rangeA: ${9 in rangeA}")
    println("10 in rangeA: ${10 in rangeA}")
    println("4 in rangeB: ${4 in rangeB}")
    println("5 in rangeB: ${5 in rangeB}")
    println("4 in rangeC: ${4 in rangeC}")
    println("5 in rangeC: ${5 in rangeC}")
}