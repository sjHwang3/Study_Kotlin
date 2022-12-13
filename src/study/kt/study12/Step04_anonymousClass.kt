package study.kt.study12

import study.kt.study12.kt.Movable

fun main() {

    /**
     * 익명클래스
     * 특정 interface나 class를 상속받은 구현체를 일회성으로 사용되는 class
     **/

    /* JAVA에서는 new 타입명() -> Kotlin에서는 object : 타입 이름 */
    moveSometing(object : Movable {
        override fun move(){
            println("==== 움직입니다 ====")
        }

        override fun fly() {
            println("==== 날아갑니다 ====")
        }
    })

}

private fun moveSometing(movable: Movable) {
    movable.move();
    movable.fly();
}
