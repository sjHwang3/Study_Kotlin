package study.kt

import study.jv.Person

fun main() {

    /**
     * Any
     * - Java의 Object 역할 ( 모든 객체의 최상위 타입 )
     * - 모든 Primitive Type의 최상위 타입
     * - Any 자체로 null 포함 할 수 없어, null 포함시에 Any?로 표현
     * - Any에 equals / hashCode / toString 존재
     **/

    /**
     * Unit
     * - void와 동일한 역할
     * - 그 제라초 타입 인자로 사용이 가능하다.
     * - 함수형에서 단 하나의 인스턴스만 갖는 타입을 의미 > 실제 존재하는 타입이라는 것을 표헌
     **/

    /**
     * Nothing
     * - 정상적으로 끝나지 않았다는 사실을 표현하는 역할
     * - 무조건 예외를 반환하는 함수 / 무한루프 함수
     **/

    /**
     * 문자열 형식 표기
     * "${변수}" < 직접 값을 넣어 문자열로 표기한다.
     **/
    printlnString(Person("박영직", 29))
    appendString(Person("김명조", 30))
}

fun fail(message: String): Nothing {
    throw IllegalAccessException(message)
}

fun printlnString(person: Person) {
    // 자바
    System.out.println(String.format("이름 %s 나이 %s", person.name, person.age))

    val log1 = "이름 ${person.name} 나이 ${person.age}"
    println(log1)

    val name = person.name
    val age = person.age
    val log2 = "이름 $name 나이 $age "
    println(log2)
}

fun appendString(person: Person) {
    var str = """
        ABCD
        EFG
        H
        ${person.name}
    """.trimIndent()

    println(str)

    var str2 = "ABC"
    println(str[0])
    println(str[2])
}
