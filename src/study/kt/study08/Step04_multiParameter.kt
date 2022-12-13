package study.kt.study08

fun main() {
    printAll("A", "B", "C")

    val array = arrayOf("E", "F", "G")

    // *array -> spread 연산자
    // 배열안에 있는 것들은 ',' 사용하는 것 처럼 꺼내서 사용한다.
    printAll(*array);
}

// 가변인자 vararg
fun printAll(vararg strings: String) {
    for(str in strings){
        println(str)
    }
}
