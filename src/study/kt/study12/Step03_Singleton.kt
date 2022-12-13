package study.kt.study12

object Singleton {
    var a: Int = 2
}

fun main() {

    /**
     * 싱글톤? 객체의 인스턴스가 오직 1개만 생성되는 패턴을 의미한다
     **/

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

}
