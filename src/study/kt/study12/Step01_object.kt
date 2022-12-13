package study.kt.study12

fun main() {

}

class Person (
    var name: String,
    var age: Int
) {

    /**
     * static ? class가 instance화 될 때 새로운 값이 복제 되는 것이 아니라
     * 정적으로 instance 끼리의 값을 공유한다.
     *
     * companion object ? class와와동행하는 유일한
     * 동반 객체도 하나의 객체로 간주되므로 이름을 명명할 수가 있고, interface를 구현할 수 있다.
     **/
    companion object {
     // val MIN_AGE = 1 : 앞에 지시어 없이 단순 val로 선언 할 경우 런타임시 0이 할당된다.
     private const val MIN_AGE = 1 // const : complie시에 할당 된다.

     fun newBaby(name: String): Person {
         return Person(name, MIN_AGE)
     }
    }

}
