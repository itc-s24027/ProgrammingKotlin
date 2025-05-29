package chap30

// 抽象クラス
abstract class Car(val color: String) {
    var distance = 0.0
    abstract fun drive(d: Double)
/*        distance += d
        println("${color}の車が ${d}km 走りました。")
        println("その結果、マイレージは ${distance}キロになりました。")*/
}