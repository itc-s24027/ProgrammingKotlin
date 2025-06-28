package exam03

import kotlin.math.atan

class Human(
    name: String,
    maxHp: Int,
    maxMp: Int,
    val strength: Int = 25,
    val stamina: Int = 20,
    val weapon: Int = 12,
    val armor: Int = 5
): Character(name,maxHp, maxMp) {

    override val attack: Int
        get() = strength + weapon

    override val defense: Int
        get() = stamina + armor

    init {
        println("ーーーーープレイヤー情報ーーーーー")
        println("名前:${name} HP:${hp} MP:${mp}")
        println("攻撃力(基礎${strength}+武器${weapon}):${attack}")
        println("防御力(基礎${stamina}+防具${armor}):${defense}")
        println("ーーーーーーーーーーーーー")
    }
}
