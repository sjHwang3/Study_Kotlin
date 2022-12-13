package study.kt.study14

import study.kt.study14.kt.Country

fun main() {
    handleCountry(Country.KOREA)
    handleCountry(Country.AMREICA)
}

fun handleCountry(
    country : Country
) {
    /*
        if(country == Country.KOREA){
            // TO-DO
        }

        if(country == Country.AMERICA){
            // TO-DO
        }
     */

    // when에서 사용되는 ENUM에 새로운 값이 추가 되었을 경우
    // 추가해주지 않는다면 when에서도 추가를 해줘야 한다.
    when (country) {
        Country.KOREA -> println("한국입니다")
        Country.AMREICA -> println("미국입니다")
    }
}

