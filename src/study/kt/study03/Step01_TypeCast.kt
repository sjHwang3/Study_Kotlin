package study.kt

fun main() {

    // 정수 뒤에 어떠한 문자가 없으면 Int 형으로 인식
    // 정수 뒤에 L이 있으면 Long 형으로 인식한다.
    val number1 = 3
    val number2 = 3L

    // 실수 뒤에 어떠한 문자가 없으면 Double 형으로 인식
    // 실수 뒤에 F가 있으면 Float 형으로 인식한다.
    val number3 = 3.0
    val number4 = 3.0F

    println("$number1, ${number1::class.simpleName}")
    println("$number2, ${number2::class.simpleName}")
    println("$number3, ${number3::class.simpleName}")
    println("$number4, ${number4::class.simpleName}")

    // 형변환
    // java:: 기본 타입간의 변환은 "암시적"으로 이루어질수 있다.
    // int number1 = 4;
    // long number2 = number1;
    // 위 처럼, (long) / number1.toLong()을 사용하지 않아도
    // int(4byte) 보다 큰 long(8byte) 형으로 암시적으로 변경이 된다.

    // kotlin:: 기본 타입간의 변환은 "명시적"으로 이루어져야 한다.
    val int1: Int = 4;
    // val long1: Long = int1 // 형 불일치로 오류 발생 (컴파일)
    // 따라서, 형변환이 필요할 때는 명시적으로 to~()를 사용하여 명시하여야 한다.
    val long1: Long = int1.toLong();

    println(int1 + long1)

    // nullable
    val int2: Int? = 3
    val int3: Int? = null
    // val long2: Long = int2.toLong(); // 형변환하려는 오리지널 값이 nullable일 경우에는 컴파일러에서 에러 발생
    // 따라서 nullable의 데이터를 형변환 할때는 적절히 처리를 해줘야 한다.
    val long2: Long = int2?.toLong() ?: 0L
    val long3: Long = int3?.toLong() ?: 0L

    println("$int2, $long2, $long3")

}
