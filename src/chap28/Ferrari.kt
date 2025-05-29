package chap28

class Ferrari(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のフェラーリが走っています！ブゥォォォーン！")
        println("マイレージは ${distance} キロになりました")
    }
}