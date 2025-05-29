package chap29

fun main() {
    val car1 = Ferrari(color = "赤")
    val car2 = Prius(color = "グレー")
    driveByFerrari(car1)
    driveByPrius(car2)
//    driveByFerrari(car2)  型が違うためエラーになる
}

fun driveByFerrari(car: Ferrari) {
    car.drive(100.0)
}
fun driveByPrius(car: Prius) {
    car.drive(100.0)
}