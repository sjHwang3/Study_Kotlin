package study.kt.study06

fun main() {
    // 1) for-each
    // 2) for
    funFor()
    // 3) Progression, Range
    // 4) while
}

fun funFor() {
    val numbers = listOf(1L, 2L, 3L)

    for(number in numbers){
        println("number in numbers:: $number")
    }

    for(i in 1..3){
        println("i in 1..3:: $i")
    }

    /**
     * downTo, step도 함수이다 (중위호출 함수)
     * 변수.함수이름(argument) 대신
     * 변수 함수이름 argument로 사용
     **/

    //내림차순
    for(i in 3 downTo 1){
        println("downTo:: $i")
    }

    //2씩 증가
    for(i in 1..5 step 2){
        println("i in 1..5 step 2:: $i")
    }
}



