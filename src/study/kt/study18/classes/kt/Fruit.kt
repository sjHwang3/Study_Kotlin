package study.kt.study18.classes.kt

data class Fruit (
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
) {

    val isSamePrice: Boolean
        get() = factoryPrice == currentPrice

}
