package study.kt.study05

fun main() {
    println(startsWhithA("CDA"))
    judgeNumber(2)

    // when은 Enum Class 혹은 Sealed Class와
    // 함께 사용하면 좋다.

}

fun startsWhithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when {
        number == 0 -> println("0입니다")
        number % 2 == 0 -> println("짝수입니다.")
        else -> println("홀수입니다.")
    }
}
