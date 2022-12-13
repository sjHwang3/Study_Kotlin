package study.kt.study08

/**
 * 함수 문법
 * 접근지시어 fun 함수명(파라미터): 반환타입 {
 * }
 *
 * (public static 생략가능) fun func01(str: String): String {
 * }
 **/

fun main() {
    val maxInt: Int = max(2, 3)
    println("${maxInt}이(가) 더 큽니다")
    println("${max2(4, 5)}이(가) 더 큽니다")
    println("${max3(6, 5)}이(가) 더 큽니다")
}

fun max(a: Int, b: Int): Int {
    /*
        val rtnInt: Int = if( a > b) {
            a
        } else {
            b
        }

        return rtnInt
    */

    return if( a > b ) {
        a
    } else {
        b
    }
}

/**
 * kotlin에서 결과값이 단일 결과값일 때 block { return ..... } 구문 대신 함수에 바로 = 결과값을 대입시킬 수 있다.
 * 그리고, 결과 값의 반환 타입을 자동으로 추론이 가능하기 때문에, 반환타입을 생략할 수 있다.
 **/
fun max2(a: Int, b: Int) /** : Int **/ = if ( a > b ) {
    a
} else {
    b
}

/**
 * if~else block 구문도 간략하기 때문에 중괄호 생략 가능
 **/
fun max3(a: Int, b: Int) = if (a > b) a else b
