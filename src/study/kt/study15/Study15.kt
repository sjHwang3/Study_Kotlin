package study.kt.study15

fun main() {
    /* 1) 배열
        * 배열 보다는 리스트 사용이 권장됨.
    */
    printArray()

    /* 2) Collection
          - Collection을 만들어 줄 때 불변인지, 가변인지를 설정해야 한다.
            - 가변컬랙션 (mutable) : collection에 element를 추가/삭제 할 수 있다.
            - 불변컬랙션           : 추가/삭제 할 수 없다. > Collections.unmodifiableList()
              * 불변 컬렉션이라 하더라도 Reference Type의 Element의 field는 바꿀 수 있다.
     */

    // List
    printList()
    // 가변의 list
    printMutableList()

    // set 집합
    // list와 달리 순서가 없고, 같은 element는 하나만 존재할 수 있다.
    // 자료구조적 의미만 제외, 모든 기능이 list와 비슷
    printSet()
    // 가변의 set
    // LinkedHashSet
    printMutableSet()

    // Map
    printMap()

    /*
        collection null able
        1) List<Int?>
           - List에 null을 값으로서 허용하나 List 자체는 null이 될 수 없다.

        2) List<Int>?
           - List에 null을 값으로서 허용할 수 없으나 List 자체는 null이 될 수 있다.

        3) List<Int?>?
           - List에 null을 값으로서 허용하고 List 자체도 null이 될 수 있다.
     */

}
fun printArray(){
    val iArray = arrayOf(100 ,200)

    // indices: 0부터 마지막 index까지의 Range이다.
    for (idx in iArray.indices) {
        println("indices :: index - $idx / value - ${iArray[idx]}")
    }

    // java .add()
    iArray.plus(300)

    // withIndex: index와 value를 모두 가져올 수 있다.
    for ((idx, value) in iArray.withIndex()) {
        println("withIndex :: index - $idx / value - $value")
    }
}

fun printList(){
    val iList = listOf<Int>(100, 200)

    println("index 0 : ${iList[0]}")

    for (i in iList) {
        println("i : $i")
    }

    for ((index, value) in iList.withIndex()){
        println("index $index : $value")
    }

    /* emptyList 사용시 반드시 타입을 <>에 명시해줘야 한다. */
    val eList = emptyList<Int>()

    /* emptyList에 타입을 간주할 수 있는 경우에는 타입을 생략하여도 된다. */
    println(emptyListWithoutType(emptyList()))
    println(emptyListWithoutType(iList))
}

fun emptyListWithoutType(iList: List<Int>): List<Int> {
    return iList.ifEmpty { listOf(1, 2, 3) }
}

fun printMutableList() {
    br()
    println("======= printMutableList =======")

    val iList = mutableListOf<Int>(1000, 2000)
    iList.add(3000)

    for (i in iList) {
        println("i : $i")
    }

    for ((index, value) in iList.withIndex()){
        println("index $index : $value")
    }
}

fun printSet(){
    br()
    println("======= printSet =======")

    val iSet = setOf(100, 200)

    for (i in iSet){
        println("for i in iSet ==> $i")
    }

    br()

    for ((index, value) in iSet.withIndex()){
        println("set index $index value $value")
    }
}

fun printMutableSet(){
    br()
    println("======= printMutableSet =======")

    val iSet = mutableSetOf(1000, 2000)
    iSet.add(3000)

    for (i in iSet){
        println("for i in iSet ==> $i")
    }

    br()

    for ((index, value) in iSet.withIndex()){
        println("set index $index value $value")
    }
}

fun printMap() {
    val map = mutableMapOf<Int, String>()
    map[6] = "Saturday"
    map[0] = "Sunday"

    println("map $map")

    val map2 = mapOf(1 to "Monday", 2 to "Tuesday")
    println("map2 $map2")

    for (key in map2.keys){
        println("map2.key $key")
        println("data ${map2[key]}")
    }

    for ((key, value) in map.entries){
        println("map1.key $key value $value")
    }
}

fun br(){
    println("")
    println("")
}
