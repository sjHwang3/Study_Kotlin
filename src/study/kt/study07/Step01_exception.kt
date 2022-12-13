package study.kt.study07

import java.lang.NumberFormatException

fun main() {

    // try..catch..finally
    parseIntOrThrow("1")
    parseIntOrThrow("D")

    println(returnParseIntOrThrow("90"))
    println(returnParseIntOrThrow("AA"))
    // Checked Exception Unchecked Exception
    // try with resources

}


fun parseIntOrThrow(str: String): Int? {
    try {
        return str.toInt()
    } catch(e: NumberFormatException) {
        //throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다!");
        return null
    }
}

fun returnParseIntOrThrow(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        return null
    }
}
