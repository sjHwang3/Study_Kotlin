package study.kt.study16

import study.kt.study16.kt.MyPerson

fun main() {

}

fun createPerson(firstName: String, lastName: String, age: Int): MyPerson {
    /*if(firstName.isEmpty()){
        throw IllegalArgumentException("firstName의 값은 필수입니다. 현재 걊 $firstName")
    }

    if(lastName.isEmpty()){
        throw IllegalArgumentException("lastName의 값은 필수입니다. 현재 걊 $lastName")
    }*/

    /* 지역함수 */
    fun validateName(name: String, fieldName: String){
        if(name.isEmpty()){
            throw IllegalArgumentException("${fieldName}의 값은 필수입니다. 현재 걊 $name")
        }
    }

    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return MyPerson(firstName, lastName, age)
}
