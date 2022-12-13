package study.kt.study11

fun main() {
    /**
     * Kotlin 파일 접근 제어 지시어
     *
     * 1) public        :   기본값, 어디서든 접근 가능
     * 2) protectd      :   파일(최상단)에는 사용 불가능
     *         L kotlin에서는 선정된 class와 하위 class에 작동하는 지시어
     * 3) internal      :   같은 모듈에서만 접근 가능
     * 4) private       :   같은 파일내에서만 접근 가능
     *
     **/
}

// Kotlin은 .kt 파일에 변수, 함수, 클래스 어려개를 만들 수 있다.
val myVal: String = ""

fun myFun(){

}

class MyClass()
class MyClassB()

