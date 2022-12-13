package study.kt.study11

fun main() {
    /**
     * === class ===
     * ** 생성자에서 사용할 때는 contrunctor를 같이 사용해야만 한다.
     * 1) public        :   모든 곳에서 접근 가능
     * 2) protected     :   선언된 class 또는 하위 class 접근 가능
     * 3) internal      :   같은 모듈에서만 접근 가능
     * 4) private       :   선언된 class 내에서만 접근 가능
     *
     * === property ===
     * 1) public        :   모든 곳에서 접근 가능
     * 2) protected     :   선언된 class 또는 하위 class 접근 가능
     * 3) internal      :   같은 모듈에서만 접근 가능
     * 4) private       :   선언된 class 내에서만 접근 가능
     *
     * ** getter, setter 한번에 접근 지시어를 정하거나,
     * ** setter에만 추가로 가시 성을 부여할 수 있다.
     * ** myCar class 참고
     **/
}

class myClass private constructor()

open class myClassB protected constructor()

class myCar(
    internal val name: String,
    _price: Int
){
    var price = _price
        private set
}
