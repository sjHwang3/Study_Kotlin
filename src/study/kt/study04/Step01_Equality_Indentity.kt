package study.kt.study03

import study.kt.study04.JavaMoney

fun main() {

    /**
     * 연산자
     *
     * 단항연산자 ++ --
     * 산술연산자 + - / * %
     * 산술대입연산자 += =+ *= /= %=
     * 비교연산자 < > <= >=
     *
     **/

    compareTo()
    equalsTo()

}


fun compareTo() {

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if(money1 > money2){
        println("Money1이 Money2보다 큽니다.")
    }

}

fun equalsTo() {
    // 동등성 Equality : 두 객체의 값이 같은가? ( 자바 : equals / 코틀린 : ==, equals )
    // 동일성 Identity : 완전히 동일한 객체인가? 주소가 같은가? ( 자바 : == / 코틀린 : === )

    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println("money1 === money2 :: ${money1 === money2}");
    println("money1 === money3 :: ${money1 === money3}");
    println("money1 == money3 :: ${money1 == money3}");
    println("oney1.equals(money3) :: ${money1.equals(money3)}");
}
