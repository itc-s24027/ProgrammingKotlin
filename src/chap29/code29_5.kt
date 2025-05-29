package chap29

fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByCar2(car1) // Ferrari型をパラメータとして受け取る方の関数が呼ばれる
    driveByCar2(car2) // Prius型をパラメータとして受け取る方の関数が呼ばれる
}

fun driveByCar2(car: Car) {
    car.drive(100.0)

}
