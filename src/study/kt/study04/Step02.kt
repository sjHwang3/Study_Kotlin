package study.kt.study04

fun main() {
    // 논리연산자 && || !
    if(fun1() || fun2()){
        println("본문")
    }

    if(fun1() && fun2()){
        println("본문")
    }
}

fun fun1(): Boolean {
    println("fun1");
    return true
}

fun fun2(): Boolean {
    println("fun2");
    return false
}
