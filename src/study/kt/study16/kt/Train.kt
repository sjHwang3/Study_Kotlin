package study.kt.study16.kt

open class Train(
    val name: String = "새마을기차",
    val price: Int   = 5_000,
)

fun Train.isExpensive(): Boolean {
    println("Train.isExpensive")
    return this.price >= 5000
}
