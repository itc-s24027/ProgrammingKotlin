package exam03

class Slime(name: String) : Enemy(name,50, 10) {
    override val attack: Int = 30
    override val defense: Int = 37

    init {
        println("ーーーーー敵情報ーーーーー")
        println("名前:${name} HP:${hp} MP:${mp}")
        println("攻撃力:${attack}")
        println("防御力:${defense}")
        println("ーーーーーーーーーーーーー")
    }
}
