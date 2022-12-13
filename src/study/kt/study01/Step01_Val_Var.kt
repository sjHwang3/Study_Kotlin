// package kotlin :: kotlin에서는 패키지명으로 kotlin을 사용할 수 없다.
package study

fun main() {
    /**
     * long long1 = 10L;
     * final long2 = 10L;
     * ( final: 불변의 변수 )
     *
     * Long long3 = 1_0000L;
     **/

    // var - varible - 발: 가변의 변수
    var long1 = 10L
    // val - value - 밸: 불변의 변수
    val long2 = 10L

    // kotlin에서는 변수의 type을 compiler에서 자동으로 추론해주기 때문에
    // 의무적으로 명시를 하지 아니해도 되지만
    // 변수의 type을 지정해줄시에는 :타입명(Long, String, Integer)등으로 명시해줄 수 있다.
    var long3: Long = 10L

    println("change()-before: $long1, $long2, $long3");
    long1 = 20L
    long3 = 1_000L

    println("change()-after: $long1, $long2, $long3");

    // 초기화된 값이 없을 경우
    // var long4 // compiler가 type을 추론하지 못하기 때문에 error 발생
    // var long5: Long // type을 명시해줄 경우 error는 발생하지 않으나
    // println에서 해당 변수를 표기할 시에는 값이 읎으므로 에러가 발생
    // println("$long4 $long5")
    // long5 = 10L
    // println("$long5"); 변수에 초기값을 지정해주엇기 때문에 에러 발생하지 않음

    // val의 경우
    // val long6 // 같은 이유로 에러 발생
    // val long7: Long // 같은 이유로 에러가 발생하지 않음
    // println에서 해당 변수를 표기할 시에는 값이 없으므로 에러가 발생
    // println("$long6, $long7")
    // val은 기본적으로 불변이기 때문에 값을 추가적으로 명시할 수 없으나
    // 초기화 되지 않은 val의 경우 단 1회로 아래처럼 데이터를 명시할 수 있다.
    // long7 = 10L
    // println("$long7")

    // val collection에는 element를 추가할 수 있다.
    // java에서는 final로 지정된 collection인 경우
    // 초기값을 명시한 이후의 값을 변경할 수 없으나
    // 초기값의 명시된 collection에 element를 추가할 수 있다.

    // long long8 = 10L // Primitive type = 변수에 값 자체를 저장
    // Long long9 = 1_000L // Reference type = 메모리상에 객체가 있는 위치를 저장
    // kotlin에서는 연산할 경우 알아서 상황에 따라서 내부적으로 primitive type으로 변환하여 연산한다.
    var long8 = 10L
    var long9 = 1_000L

    println("$long8, $long9")

    var long10 = 10L
    // long10 = null
    // kotlin에서는 기본적으로 null을 허용하지 않기 때문에 해당 변수에 null을 선언할 수 없음

    // null을 선언할 때는 타입명 뒤에 ?을 붙여 nullable된 변수라는 것을 명시해야함.
    var long11: Long? = null

    // kotlin에서는 객체를 instance 할시에는 new 생성자를 쓰면 안됨

}
