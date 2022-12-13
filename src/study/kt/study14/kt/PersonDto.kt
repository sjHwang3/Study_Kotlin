package study.kt.study14.kt

data class PersonDto(
    private val name: String,
    private val age: Int,
) {
    /*
        class를 data class로 선언하면 자동으로
        equals, hashCode, toString을 생성해준다.
     */
}
