package study.kt.study18

import study.kt.study18.classes.kt.Fruit

fun main() {
    val fruits = Fruits()

    println("=====================")
    // .groupBy: {} 기준으로 Grouping
    val fruitsGroupBy: Map<String, List<Fruit>> = fruits.groupBy { it.name }
    println("fruitsGroupBy $fruitsGroupBy")

    val fruitsGroupByKV: Map<String, List<Long>> = fruits.groupBy({ it.name }, { it.factoryPrice })
    println("fruitsGroupByKV $fruitsGroupByKV")
    println("=====================")
    println("=====================")
    // .associateBy:
    val fruitsAssociateBy: Map<Long, Fruit> = fruits.associateBy{ it.id }
    println("fruitsAssociateBy $fruitsAssociateBy")
    println("=====================")
    println("=====================")
    println("=====================")
    println("=====================")
    println("=====================")
    println("=====================")
    println("=====================")
    println("=====================")
    println("=====================")
    println("=====================")

}
