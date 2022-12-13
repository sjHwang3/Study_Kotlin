/**
 * Kotiln
 * 1) JVM (자바 가상머신) 언어 > 100% 자바 호환
 * 2) 간결한 코드 > 생산성 증가
 * 3) Null Point의 안전한 대흥 > 타입추론의 편함
 **/

class HelloKotlin {
    fun HelloKotlin(): String {
        return "Hello Kotlin!"
    }
}

class Math {
    fun add(a :Int, b :Int) :Int {
        return a+b
    }

    fun minus(a :Int, b :Int) :Int {
        return a-b
    }
}

const val CONST_VAL_MESSAGE = "hello, Kotlin?"

fun main() {
    var VAR_MESSAGE :String? = "hello, Kotlin?"
    val VAL_MESSAGE = "hello, Kotlin?"

    println("VAR (before) :: $VAR_MESSAGE")
    println("VAL (before) :: $VAL_MESSAGE")
    println("CONST (before) :: $CONST_VAL_MESSAGE")

    VAR_MESSAGE = "good~moring, Kotlin?"
    println("VAR (after #1) :: $VAR_MESSAGE")

    VAR_MESSAGE = null
    println("VAR (after #2) :: $VAR_MESSAGE")

    var ORIGINAL_DATA :String = "30"
    var VAR_TYPE = "${ORIGINAL_DATA::class.simpleName}"
    println("CHANGE VAR TYPE (before) :: $ORIGINAL_DATA ($VAR_TYPE)")

    var TO_INTEGER = Integer.parseInt(ORIGINAL_DATA)
    VAR_TYPE = "${TO_INTEGER::class.simpleName}"
    println("CHANGE VAR TYPE (after #parseInt?) :: $TO_INTEGER ($VAR_TYPE)")

    var TO_AS_INTEGER = ORIGINAL_DATA as? Int ?: Integer.parseInt(ORIGINAL_DATA)
    VAR_TYPE = "${TO_AS_INTEGER::class.simpleName}"
    println("CHANGE VAR TYPE (after #as?) :: $TO_AS_INTEGER ($VAR_TYPE)")
}

