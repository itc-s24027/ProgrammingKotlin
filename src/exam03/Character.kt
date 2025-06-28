package exam03

abstract class Character(
    val name: String = "",
    maxHp: Int,
    maxMp: Int,
)
{
    var hp: Int = maxHp
    var mp: Int = maxMp
    abstract val attack: Int
    abstract val defense: Int


    override fun toString(): String {
        return name
    }

    fun attackTo(target: Character): Int{
        println()
        println("===${this.name}が${target.name}に攻撃！===")
        return target.attacked(this.attack)
    }

    fun attacked(power: Int): Int {
        val randomnum = (28..36).random()
        val d: Double = (power * 0.5 - this.defense * 0.25) * (randomnum / 32)
        val damage = d.toInt()

        if (damage <= 0) println("-->${this.name}は攻撃をよけた")
        else println("-->${this.name}に${damage}ダメージ攻撃！")

        hp -= damage

        if (hp <= 0) println("${this.name}は力尽きた")
        else println("${this.name}の残りHPは${this.hp}です")
        println("=========================")

        return damage
    }
}