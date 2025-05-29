package exam01

/**
 * 映画館の入場料を計算するプログラム
 * シニア -> 一般 -> 子供 の順で人数を入力して
 * 一人あたりの料金は　シニア：　1,300円　一般： 2,000円　子供： 1,000円
 * ただし、10名以上の場合は、各200円割引
 */
fun main() {
    var sinia = 1300
    var ippan = 2000
    var kodomo = 1000

    print("シニアの人数を入力してください：")
    val a = readln().toInt()
    print("一般の人数を入力してください：")
    val b = readln().toInt()
    print("子供の人数を入力してください：")
    val c = readln().toInt()
    val goukeininzuu = a + b + c

//    var siniaprice = sinia * a
//    var ippanprice = ippan * b
//    var kodomoprice = kodomo * a

    if (goukeininzuu >= 10) {
        sinia -= 200
        ippan -= 200
        kodomo -= 200
        println("シニアの料金: ${sinia * a}")
        println("一般の料金: ${ippan * b}")
        println("子供の料金: ${kodomo * c}")
    } else {
        println("シニアの料金: ${sinia * a}")
        println("一般の料金: ${ippan * b}")
        println("子供の料金: ${kodomo * c}")
    }

}
