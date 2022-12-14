package study.kt.study17

import study.kt.study17.classes.kt.Fruit

fun main() {
    /*
        ** 람다 / 스트림
        * 자바에서는 함수는 변수에 할당되거나 파라미터로 전달 할 수 없음
        * 따라서, 람다와 스트림이 등장하게 되었다.

        ** 코틀린에서의 람다와 스트림
        * 함수가 그 자체로 값이 될 수 있다.
        * 변수에 할당 되거나, 파라미터로도 전달 할 수 있음.

        변수 -> 변수를 이용한 함수
        (변수A , 변수B) -> 변수 A와 변수 B를 이용한 함수
     */

    fruit()
}

fun fruit() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_250),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 2_500),
        Fruit("바나나", 3_200),
        Fruit("수박", 1_0000),
    )

    // 람다를 만드는 방법 #1
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name === "사과"
    }

    // 람다를 만드는 방법 #2
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name === "사과"}

    for ((index, data) in fruits.withIndex()){

        println("==============================")
        // 람다를 직접 호출하는 방법 #1
        println("isApple $index         :: ${isApple(data)}")
        // 람다를 직접 호출하는 방법 #2
        println("isApple.invoke $index  :: ${isApple.invoke(data)}")
        println("==============================")
        println("isApple2 $index        :: ${isApple2(data)}")
        println("isApple2.invoke $index :: ${isApple2.invoke(data)}")
        println("==============================")

    }

    println("==============================")
    val result1 = filterFruits(fruits, isApple)
    for ((index, data) in result1.withIndex()) {
        println("filterFruits(fruits, isApple) $index ${data.name} ${data.price}")
    }
    println("==============================")
    val result2 = filterFruits(fruits, isApple2)
    for ((index, data) in result2.withIndex()){
        println("filterFruits(fruits, isApple2) $index ${data.name} ${data.price}")
    }
    println("==============================")

    println("==============================")
    val result3 = filterFruits(fruits) { fruit: Fruit -> fruit.name === "사과" }
    for ((index, data) in result3.withIndex()){
        println("filterFruits(fruits) { fruit: Fruit -> fruit.name === \"사과\" } $index ${data.name} ${data.price}")
    }
    println("==============================")

    println("==============================")
    // fruit: Fruit -> fruit.name을 a -> a.name으로 간략하게 사용
    val result4 = filterFruits(fruits) { a -> a.name === "사과" }
    for ((index, data) in result4.withIndex()){
        println("filterFruits(fruits) { a -> a.name === \"사과\" } $index ${data.name} ${data.price}")
    }
    println("==============================")

    println("==============================")
    // fruit -> fruit.name을 it.name으로 간략하게 사용
    val result5 = filterFruits(fruits) { it.name === "바나나" }
    for ((index, data) in result5.withIndex()){
        println("filterFruits(fruits) { it.name === \"바나나\" } $index ${data.name} ${data.price}")
    }
    println("==============================")

    println("==============================")
    /*
        Closure
        코틀린에서는 람다가 시작하는 지점에 참조하고 있는 변수들을 모두 포획하여 그 정보를 가지고 있다.
     */
    var targetName = "바나나"
    targetName = "수박"

    val result6 = filterFruits(fruits) { it.name === targetName}
    for ((index, data) in result6.withIndex()){
        println("filterFruits(fruits) { it.name === targetName} $index ${data.name} ${data.price}")
    }
    println("==============================")



}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()

    for(fruit in fruits){
        if(filter(fruit)){
            results.add(fruit)
        }
    }

    return results
}
