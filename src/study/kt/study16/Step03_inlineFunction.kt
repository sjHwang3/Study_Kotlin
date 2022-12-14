package study.kt.study16

fun main() {
    /*
        Inline 함수
        - 함수가 호출되는 대신, 함수를 호출한 지점의 함수 본문을 그대로 복붙하고 싶은 경우 사용
        - 함수를 파라미터로 전달할 때에 오버헤드를 줄일 수 있다.
          하지만, inline 함수의 사용은 성능측정과 함께 신중하게 사용되어야 함.
     */

    3.addInline(4)
}

inline fun Int.addInline(other: Int): Int {
    return this + other
}
