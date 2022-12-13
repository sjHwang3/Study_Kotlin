package study.kt.study10.kt.classes

class Cat(
    species: String
    // 타입 알림도 :, 상속 알림도 :를 사용함.
    // 둘 사이의 구분은 타입 알림 일때는 타입명: 붙여써야하고
    // class 클래스명() : 한칸을 띄어써야한다.
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}
