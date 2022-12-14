package study.kt.study18

import study.kt.study18.classes.kt.Fruit

fun main() {
    //
    val fruits = Fruits()
    val apples = fruits.filter { it.name == "사과" }
    val applePrices = fruits.filter { it.name == "사과" }
        .map { it.currentPrice }

    println("================================")
    for( (index, apple) in apples.withIndex() ) {
        println("${index}번째 ${apple.name}")
    }
    println("================================")

    println("================================")
    for( (index, price) in applePrices.withIndex() ) {
        println("${index}번째 사과 가격 : ${price} 원")
    }
    println("================================")


    println("================================")
    // .all : 조건 모두를 만족하면 true
    val isAllApple = fruits.all { it.name == "사과" }
    println("모두 사과입니까? 답 : $isAllApple")
    println("================================")

    println("================================")
    // .none : 조건 모두를 불만족한다면 true
    val isNoApple = fruits.none { it.name == "사과" }
    println("모두 사과가 아닙니까? 답 : $isNoApple")
    println("================================")

    println("================================")
    // .count
    val applesCount = fruits.count { it.name == "사과" }
    println("사과는 총 몇개 입니까? 답 : $applesCount")
    println("================================")

    println("================================")
    // .sortedBy: 오름차순정렬
    val fruitsSortedBy = fruits.sortedBy { it.currentPrice }

    for( fruit in fruitsSortedBy ){
        println("${fruit.name} / ${fruit.currentPrice}")
    }
    println("================================")

    println("================================")
    // .sortedByDescending: 내림차순정렬
    val fruitsSortedByDescending = fruits.sortedByDescending { it.currentPrice }

    for( fruit in fruitsSortedByDescending ){
        println("${fruit.name} / ${fruit.currentPrice}")
    }
    println("================================")

    println("================================")
    // .distinctBy: 중복 제거
    val fruitsDistinctBy = fruits.distinctBy { it.name }

    for (fruit in fruits){
        println("중복제거 전:: ${fruit.name}")
    }
    println("================================")
    for ( fruit in fruitsDistinctBy ) {
        println("중복제거:: ${fruit.name}")
    }
    println("================================")

    println("================================")
    // .first: 첫번째 값
    val firstFruit = fruits.first()
    println("첫번째 과일: ${firstFruit.name} / ${firstFruit.currentPrice}")
    println("================================")

    println("================================")
    // .last: 마지막 값
    val lastFruit = fruits.last()
    println("마지막 과일: ${lastFruit.name} / ${lastFruit.currentPrice}")
    println("================================")
}

fun Fruits(): List<Fruit> {
    return listOf(
        Fruit(1, "사과", 1_000L, 1_200L),
        Fruit(6, "사과", 1_200L, 1_400L),
        Fruit(2, "바나나", 1_500L, 1_800L),
        Fruit(3, "수박", 1_2000L, 1_5000L),
        Fruit(4, "딸기", 3_000L, 3_500L),
        Fruit(5, "오렌지", 2_000L, 2_400L),
    )
}

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}



