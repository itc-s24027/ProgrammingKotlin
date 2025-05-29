package chap32

fun main() {
    // nullを代入できるようにする
    // null許容型
    var text: String? = "あいうえお"
    text = null
    println("文字列「$text」の長さ = ${text?.length}")

    var text_a: String = "あいうえお"
    var text_b: String? = null
    var length_a = countTextLength2(text_a)
    var length_b = countTextLength2(text_b) //countTextLength1だと型が違うので弾かれる
    println("length_a: $length_a")
    println("length_b: $length_b")
//    var length_n = countTextLength1(null)
}

fun countTextLength1(text: String) : Int {
    return text.length
}

fun countTextLength2(text: String?) : Int { //null許容型の関数
    return text?.length ?: 0
    // もし直前に書かれた式がnull以外ならその値を返す
    // nullならその後に書かれた値を返す
}