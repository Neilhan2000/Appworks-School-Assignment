open class Human(name: String) {

    var name = name
    var havaMana = true

    open fun attack() {
        println("$name use Fist Attack!")
        //fist attack do not need mana
    }

    open fun checkMana() {
        if (havaMana == true) {
            println("$name still have mana")
        } else {
            println("$name out of mana")
        }
    }
}

class Mage(name: String) : Human(name) {

    override fun attack() {
        println("$name use Fireball!")
        havaMana = false
        //using fireball will consume mana
    }
}

fun main() {
    val human = Human("A happy villager")
    val mage = Mage("A chuunibyou high school student")
    human.attack()
    human.checkMana()
    mage.attack()
    mage.checkMana()


}