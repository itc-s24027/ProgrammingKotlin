package chap27

class Ferrari(c: String) : Car(c) // Carクラスを継承

fun main() {
    val car = Ferrari("赤") // フェラーリをインスタンス化
    car.drive(5.0)
    car.drive(10.0)
}