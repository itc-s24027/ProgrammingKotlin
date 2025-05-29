package chap30

class Prius(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のプリウスが走っています！スウィーン！")
        println("すごい静かだね！")
        println("マイレージは ${distance} キロです。")
        println("トヨタの車はいっぱい走ってもなかなか故障しません！")
    }
}