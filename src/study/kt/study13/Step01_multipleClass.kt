package study.kt.study13

fun main() {

      /*

      1) static 중접 클래스
         (자바)
         - public static class ~ 로 선언하면 외부에서 해당 클래스를 사용할 수 없다.

         - 클래스 안의 내부 클래스를 선언 할 경우 static으로 선언하지 않는다면
           아래 문제점이 있을 수 있어 지양하는 편이다.

            * 내부 클래스는 숨겨진 외부 클래스 정보를 가지고 있어,
            참조를 해지 하지 못하는 경우 메모리 누수가 생길 수 있고,
            이를 디버깅 하기가 어렵다.
            * 내부 클래스의 직렬화 형태가 명확하게 정의되지 않아
            직렬화에 있어 제한이 있을 수 있다.

      2) static을 사용하지 않는 중첩 클래스

         - 내부 클래스 inner class
         - 지역 클래스 local class
         - 익명 클래스 annonymous class

    */

}

class MyHouse (
    private val address: String,
    private val livingRoom: LivingRoom,
    private val bathRoom: BathRoom,
) {

    /*
        Java에서 권장하는 중첩 클래스

        Kotlin에서는 static이 없어져서 부모 클래스 안에
        내부(자식) 클래스를 선언하면 된다.
    */
    class LivingRoom(
        private val area: Double
    ) {
    }

    /*
        Java에서 권장하지 않는 중첩 클래스

        Kotlin에서는 바깥 클래스와 연결 되어 있음을 명시하기 위해서
        inner class로 선언해준다.

        바깥 클래스 참조를 위해 "this@바깥클래스명.필드"를 사용한다.
     */
    inner class BathRoom (
        private val area: Double
    ) {
        val address: String
            get() = this@MyHouse.address
    }
}
