package study.kt.study14

import study.kt.study14.kt.PersonDto

fun main() {

    /*
        1) Data Class
           - 계층간 데이터를 전달하기 위한 DTO (Data Transfer Object)
             * Data (Field)
             * constructor, getter / setter
             * equals, hashCode
             * toString
           - IDE / Lombok 활용 가능
           - 단점 : 장황해지는 클래스, 추가적인 처리 필요
     */

    val personA = PersonDto("재영", 100)
    val personB = PersonDto("상추", 200)
    println("==================")
    println("person :: $personA / $personB}")
    println("person.toString :: ${personA.toString()} / ${personB.toString()}")
    println("==================")
    println("person.equals :: ${personA == personB}")
    println("==================")

}
