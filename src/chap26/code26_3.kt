package chap26

/*
セカンダリコンストラクタ
 */
fun main() {
    val p = Person(7)
    val p2 = Person("スズキ","タロウ")
}

class Person(val name: String, val age: Int) {
    // プライマリコンストラクタのイニシャライザ
    init {
        println("プライマリコンストラクタのイニシャライザが呼ばれました。")
        println("指定されたパラメータは${name}と${age}です。")
    }
    // セカンダリコンストラクタ
    constructor(age: Int) : this("名無しさん", age) {
        println("年齢だけを指定するセカンダリコンストラクタのイニシャライズザが呼ばれました。")
    }

    constructor(lastName: String, firstName: String) :
            this("$lastName $firstName", 20) {
                println("苗字と名前を指定するセカンダリコンストラクタのイニシャライザが呼ばれました。")
            }
}