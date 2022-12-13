package study.kt.study16

fun main() {
    /*
        확장함수
        - 자바로 만들어진 라이브러리를 코틀린 코드로 유지보수 및 확장하고 싶을 때 사용.
        - 어떤 클래스 안에 있는 메소드 처럼 호출하고, 함수 밖에 만들수 있음.

        fun 확장하려크래스.함수명(파라미터): 리턴타입 {
            // this(수신객체)를 이용하여 실제 클래스 안의 값에 접근
        }
     */

    val str: String = "안녕? 코틀린 월드"
    val lastChar = str.lastChar();
    println("==============================")
    println("str $str / lastChar $lastChar")
    println("==============================")

    /*
        ** 확장함수가 public으로 선언되어 있고 확장함수의 수신객체 클래스가 private 함수 라면?
        - 캡슐화가 깨진다. 따라서, 확장 함수는 private 혹은 protected 멤버를 가져올 수 없다.

        ** 멤버함수와 확장함수의 시그니쳐가 같다면?
        - 멤버함수가 우선적으로 호출된다.
        - 확장함수를 만들었지만 다른 기능의 똑같은 멤버함수가 생기면 > 오류가 발생할 수 있다.
     */

    val person = JavaPerson("황", 100)
    println("==============================")
    println("nextYearAge ${person.nextYearAge()}")
    println("==============================")

}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun JavaPerson.nextYearAge(): Int{
    println("확장 함수")
    return this.age + 2
}
