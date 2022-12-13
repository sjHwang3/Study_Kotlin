package study.kt.study14.kt

sealed class MyCar(
    val name: String,
    val price: Long,
)

class Avante : MyCar("아반떼", 1_000L)
class Sonata : MyCar("쏘나타", 1_000L)
class Grandeur : MyCar("그랜져", 1_000L)
