package study.kt.study16

fun main() {
    /*
        중위(infix) 함수
        - 함수를 다른 방법으로 호출할 수 있는 함수
        - 변수 함수명 argument
        - 멤버함수에서도 사용할 수 있음
    */
    println("==============================")
    println(" A.add(B) ${3.add(4)}")
    println("==============================")
    println(" A.addInfix(B) ${3.addInfix(4)}")
    println("==============================")
    println(" A addInfix B ${3 addInfix 4}")
    println("==============================")
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.addInfix(other: Int): Int {
    return this + other
}

