package study.kt

import study.jv.Person

fun main() {
    printAgeIfPeronNull(null)
    printAgeIfPeronNull(Person("", 100))
}

//
fun printAgeIfPerson(obj: Any) {
    // is :: instanceof
    if(obj is Person) {
        // as :: (~) 변수를 as 뒤의 타입으로 간주한다. 뒤에 as는 생략이 가능하다.
        val person = obj as Person
        println("${obj.age} 스마트캐스트, ${person.age}")
    }
}

fun printAgeIfNotPerson(obj: Any) {
    // !is :: not instanceof
    if(obj !is Person) {
        // as :: (~) 변수를 as 뒤의 타입으로 간주한다. 뒤에 as는 생략이 가능하다.
        val person = obj as Person
        println("${obj.age} 스마트캐스트, ${person.age}")
    }
}

fun printAgeIfPeronNull(obj: Any?) {
    // 해당 함수를 호출하였을 때 전달 받은 obj가 null인경우
    // NPE가 발생한다.
    // val person1 = obj as Person

    // as 뒤에 ?를 쓰면,
    // obj가 null이 아닌 경우 Person으로 변환한다.
    val person2 = obj as? Person
    // nullable 일 경우 해당 key값 호출 시 compiler에서 에러 발생
    // println(person2.age)
    println(person2?.age)
}
