package study.kt.study10.kt.classes

import study.kt.study10.kt.interfaces.Flyable
import study.kt.study10.kt.interfaces.Swimable

class Penguin(
    sepices: String
): Animal(sepices, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다~ 뒤뚱뒤뚱")
    }

    override fun act() {
        super<Flyable>.act()
        super<Swimable>.act()
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override val swimAbility: Int
        get() = 3

}
