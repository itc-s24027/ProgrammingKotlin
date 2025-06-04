package chap35

// データクラス
data class Person(val name: String, val mynumber: Int)

fun main() {
    val p1 = Person("たけし", 1234)
    val p2 = Person("たけし", 1234)
    println("p1のハッシュコード： ${p1.hashCode()}")
    println("p2のハッシュコード： ${p2.hashCode()}")

    if (p1 == p2) {
        println("二人は同一人物")
    } else {
        println("二人は別人")
    }

    val personSet = setOf(p1, p2)
    println("personSet: ${personSet}")
    // データクラスはtoStringもオーバーライドしてくれるので
    // personSet: [Person(name=たけし, mynumber=1234)]
    // 表示をわかりやすい表記にしてくれる
}