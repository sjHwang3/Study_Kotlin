package study.kt

import study.jv.Person

fun main() {
    // 5) platform type
    // java와 병행하여 사용할 수 있음.
    val person = Person(null, 100)
    println(person.name)
    println(startsWithPersonA(person.name))
}


fun startsWithPersonA(str: String): Boolean {
    return str.startsWith("A")
}
