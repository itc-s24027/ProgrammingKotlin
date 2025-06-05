package chap38

fun main() {
    /*
        クロージャの仕組み：なにがすごい？
        関数が作られたときのスコープ（環境）を一緒に保存してくれる

        外側の関数が終わっても、変数の値を覚えていてくれる

        変数そのものを閉じ込めているので、状態を保持できる
     */
    val c1 = getTextClosure("さん") // 変数に関数オブジェクトを代入
    val c2 = getTextClosure("くん") // 変数に関数オブジェクトを代入
    val c3 = getTextClosure("ちゃん") // 変数に関数オブジェクトを代入

    println(c1("タケシ")) //関数オブジェクトの呼び出し
    println(c2("タケシ"))
    println(c3("タケシ"))
}

fun getTextClosure(x: String): (String) -> String {
    return fun(name) = name + x
}