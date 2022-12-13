package study.kt.study12

import study.kt.study12.kt.Log

fun main() {
    PersonN.Factory.log()
}

class PersonN private constructor(
    var name: String,
    var age: Int,
) {

    // 추상 메소드를 구현하지 않았기 때문에 에러 발생
    companion object Factory: Log {
        private const val MIN_AGE = 1

        @JvmStatic // Java에서 Kotlin companion object 사용시에 사용하는 annotation
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("===== 로그 ====")
        }

    }
}
