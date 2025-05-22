package chap07

fun main() {
    println("true xor true: ${true xor true}")
    println("true xor false: ${true xor false}")
    println("false xor true: ${false xor true}")
    println("false xor false: ${false xor false}")
    // xor の性質
    // どっちもtrueまたはfalseのときにfalseになる

    val a = true
    val b = false

    !a && !b == !(a || b)
    !a || !b == !(a && b)
}