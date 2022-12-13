package study.kt.study10.kt.classes

abstract class Animal(
    protected var species: String,
    // 추상 property가 아니라면 상속 받을 때 반드시 open을 붙여야한다.
    protected open val legCount: Int,
) {

    abstract fun move()

}
