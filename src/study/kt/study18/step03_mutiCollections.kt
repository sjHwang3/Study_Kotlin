package study.kt.study18

import study.kt.study18.classes.kt.Fruit

fun main() {
    val fruitsinList = fruitsInList()

    println("===========================")
    //.flatMap { }
    val samePriceFruits = fruitsInList().flatMap { list ->
        list.filter { it.factoryPrice == it.currentPrice }
    }

    for(fruit in samePriceFruits) {
        println(fruit)
    }
    println("===========================")
    println("===========================")
    // 중첩컬렉션 to 컬랙선
    val fruits = fruitsInList().flatten()

    for (fruits in fruitsinList) {
        println("$fruits")
    }

    for (fruit in fruits) {
        println("$fruit")
    }
    println("===========================")
}

fun fruitsInList():List<List<Fruit>> {
    return listOf(
        listOf(
            Fruit(1L, "사과", 1_000, 1_500),
            Fruit(2L, "사과", 1_100, 1_500),
            Fruit(3L, "사과", 1_200, 1_500),
            Fruit(4L, "사과", 1_300, 1_500),
            Fruit(5L, "사과", 1_500, 1_500),
        ),
        listOf(
            Fruit(1L, "바나나", 3_000, 3_200),
            Fruit(2L, "바나나", 3_200, 3_200),
            Fruit(3L, "바나나", 3_500, 3_200),
        ),
        listOf(
            Fruit(1L, "수박", 10_000, 10_000),
            Fruit(2L, "수박", 12_000, 10_000),
        ),
    )
}
