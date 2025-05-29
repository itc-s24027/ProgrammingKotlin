package chap29

fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByCar(car1) // Ferrari型をパラメータとして受け取る方の関数が呼ばれる
    driveByCar(car2) // Prius型をパラメータとして受け取る方の関数が呼ばれる
}

fun driveByCar(car: Ferrari) {
    println("Ferrari 対応の driveByCar が呼ばれました")
    car.drive(100.0)

}

fun driveByCar(car: Prius) {
    println("Prius 対応の driveByCar が呼ばれました")
    car.drive(100.0)
}