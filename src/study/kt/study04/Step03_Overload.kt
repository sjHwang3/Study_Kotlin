package study.kt.study04

fun main() {
    // in !in
    // 컬렉션이나 범위에 포함되어있다 (in), 포함되어있지않다 (!in)

    // a..b
    // a ~ b까지의 범위 객체를 생성한다.

    // a[i]
    // a에서 특정 index i의 값을 가져온다.

    // 연산자 오버로드
    overloaded()
}

//연산자 오버로드
fun overloaded(){
    val money1 = Money(1_000L)
    val money2 = Money(2_000L)

    println(money1 + money2)
    println(money1.plus(money2))
}
