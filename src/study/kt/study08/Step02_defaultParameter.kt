package study.kt.study08

fun main() {
    //repeat("Hello World", 3, false)
    //repeatWithDefaultParam("Hello World", 5, true)

    // 특정 변수에서 기본값을 할당해주고 싶을때
    // 특정 변수 = 기본 값 으로 선언하면 된다. 이를 named argument라고 한다.
    // 하지만, 자바의 함수를 호출 할때는 named argument를 사용할 수 없다.
    repeatWithDefaultParam("Hello World", useNewLine = true )
}

fun repeat(str: String, num: Int, useNewLine: Boolean ) {
    for( i in 1..num ){
        if(useNewLine){
            println(str)
        } else {
            print(str)
        }
    }
}

/**
 * kotlin 밖에서 파라미터를 대입하지 않으면 기본값을 선언한다.
 **/
fun repeatWithDefaultParam(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for( i in 1..num ){
        if(useNewLine){
            println(str)
        } else {
            print(str)
        }
    }
}
