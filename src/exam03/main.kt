package exam03

fun main() {
    val human = Human("たけし",50, 10)
    val slime = Slime("スライム")

    while (true) {
        print("誰を攻撃しますか?(p:プレイヤー or e:敵):")
        val input = readln()

        when (input) {
            "p" -> slime.attackTo(human)
            "e" -> human.attackTo(slime)
            else -> println("'e' または 'p' で入力してください")
        }
        if (human.hp <= 0 || slime.hp <= 0) break
    }
}