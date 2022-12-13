package study.kt.study14

import study.kt.study14.kt.Avante
import study.kt.study14.kt.Grandeur
import study.kt.study14.kt.MyCar
import study.kt.study14.kt.Sonata

fun main() {
    /*
        sealed class
        - 상속이 가능한 추상클래스
        - 외부에서는 이 클래스를 상속받을 수 없음.
        - 컴파일 타임때 하위 클래스의 타입을 모두 기억함 > 런타임때 클래스 타입이 추가 될 수 없음을 의미
        - 하위 클래스는 같은 패키지 내에 있어야함.

        * enum과 다른점
          - 클래스를 상속받을 수 있다.
          - 하위클래스는 멀티 인스턴스가 가능하다.
    */
    handleCar(Avante())
    handleCar(Sonata())
    handleCar(Grandeur())
}

fun handleCar(
    car: MyCar
){
    when (car) {
        is Avante -> println("${Avante().name} / ${Avante().price} 만원")
        is Sonata -> println("${Sonata().name} / ${Sonata().price} 만원")
        is Grandeur -> println("${Grandeur().name} / ${Grandeur().price} 만원")
    }
}
