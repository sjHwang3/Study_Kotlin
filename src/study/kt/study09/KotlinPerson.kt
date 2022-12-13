package study.kt.study09


/**
 * public (생략가능) class KotlinPerson constructor(생략가능) (name: String, age: Int) {
 *
 *      // 생성자 사용시 :타입 생략 가능
 *      // 생성자 사용시 바로 프로퍼티(field)를 선언할 수 있음
 *      // field 선언시 Getter,Setter 자동으로 생성됨.
 *      val name = name
 *      var age = age
 * }
 **/
class KotlinPerson (
    val name: String,
    var age: Int,
    gender: String,
) {
    init {
        // 클래스가 초기화 되는 시점에 호출
        if(age <= 0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
    }

    // 부 생성자는 반드시 주 생성자가 존재해야한다.
    // 부 생성자는 최종적으로 주 생성자를 통해 호출이 되어야 한다.
    // 부 생성자도 body를 가질 수 있다.
    // kotlin에서는 부 생성자 사용보다는 기본값 사용을 권장(?)한다.
    constructor(name: String): this(name, 1, "Male")

    /**
     * custom getter, setter
     * 마치 class안에 property가 있는 것처럼 보여준다.
     **/

    val isAdult: Boolean
        get() = this.age >= 20

    val gender: String = gender
            get() = field.uppercase()

    /*
       val upperCaseGender: String
           get() = this.gender.uppercase()
    */

    /*
        var gender: String = gender
            // custom setter 사용시에는 바로 변수에 대입하면 무한 로프가 돌 수 있기때문에
            // field = ~ 구문으로 사용하여야한다.
            set(value) {
                field = value.uppercase()
            }
    */
}
