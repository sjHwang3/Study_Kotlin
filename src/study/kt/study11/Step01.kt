package study.kt.study11

fun main() {
    /**
     * == JAVA ==
     *  1) public       :   모든 곳에서 접근 가능
     *  2) protected    :   같은 패키지 혹은 하위 클래스에서만 접근 가능
     *  3) default      :   같은 패키지 내에서만 접근 가능
     *  4) private      :   선언된 클래스 내에서만 접근 가능
     *
     * == Kotlin ==
     *  1) public       :   모든 곳에서 접근 가능
     *  2) protected    :   "선언 된 클래스" 혹은 하위 클래스에서만 접근 가능
     *      L kotlin에서는 패키지를 namespace 관리 용도로만 사용하기 때문에.
     *      L kotlin에서는 default를 사용하지 않는다.
     *  3) internal     :   같은 모듈에서만 접근 가능
     *      L  모듈? 한 번에 compile 되는 kotlin 코드
     *  4) private      :   선언된 클래스 내에서만 접근 가능
     *
     *
     * JAVA에서의 기본 접근 지시어는 default, kotlin에서의 기본 접근 지시어는 public
     *
     **/
}
