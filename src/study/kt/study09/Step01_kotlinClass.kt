package study.kt.study09

fun main() {
    var person = KotlinPerson("황세준", 31, "male")
    // println("이름:: ${person.getName()} / 나이:: ${person.getAge()}")
    println("이름:: ${person.name} / 나이:: ${person.age} / 성인여부: ${person.isAdult}")

    person.age = 32 // person.setAge(32)
    println("이름:: ${person.name} / 나이:: ${person.age} / 성벌: ${person.gender}")

    var personB = KotlinPerson("황세준")
    println("이름:: ${personB.name} / 나이:: ${personB.age} / 성별: ${personB.gender} / 성인여부: ${personB.isAdult}")

}
