package study

import study.jv.Person

fun main() {
    // 1) kotlin에서의 null check
    println(startsWithRtnNull(null))
    println(startsWithRtnFalse(null))
    //println(startsWithILAE(null))
    // startsWithNN(null)
    // startsWithNPE(null)

    // 2) safe call ?.
    // - safe call 안전한 호출
    //      값이 null이면 실행하지 않고 (그대로 null 반환) 값이 null이 아니면 실행
    val str: String? = "ABC"
    println(str?.length)

    val str2: String? = null
    println(str2?.length)

    // 3) elvis 연산자 ?:
    // - 앞의 연산 결과가 null이면 뒤의 값을 사용
    val str3: String? = null
    println(str3?.length ?: 0)

    println(startsWithRtnNull2(null))
    println(startsWithRtnFalse2(null))

    // 4) null 아님 단언
    // -  nullable type이지만, 아무리 생각해도 null이 될 수 없는 경우
    println(startsWithNotNullable("ABC"))
}

fun startsWithILAE(str: String?): Boolean {
    if(str == null)
        throw IllegalAccessException("null이 들어왔습니다")

    return str.startsWith("A")
}

fun startsWithILAEWith2(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalAccessException("null이 들어왔습니다")
}

fun startsWithRtnNull(str: String?): Boolean? {
    if(str == null)
        return null

    return str.startsWith("A")
}

fun startsWithRtnNull2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithRtnFalse(str: String?): Boolean {
    // str.startsWith("A")
    // 함수를 바로 호출하면 return 값은 null을 허용할 수 없는데
    // null이 허용될 수 있음을 감지할 수 있기 때문에 에러 처리

    // 그러나, null이 체크되는 구문이 있을 때
    // compiler에서 이를 감지하여 아래 바로 함수를 호출했을 때 null 아님을 간주한다.
    if(str == null)
        return false

    return str.startsWith("A")
}

fun startsWithRtnFalse2(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithNotNullable(str: String?): Boolean {
    // 해당 부분은 nullable type 이기 때문에 null을 허용하지 않을 시에는 에러가 발생한다.
    // return str.startWith("A")

    // null이 들어오면 컴파일러에서는 오류가 나지 않지만
    // run-time에서는 NPE가 발생함.
    // 따라서 정말 null이 아닐 경우에만 사용해야함.
    return str!!.startsWith("A")
}

fun startsWithNN(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithNPE(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithPersonA(str: String): Boolean {
    return str.startsWith("A")
}
