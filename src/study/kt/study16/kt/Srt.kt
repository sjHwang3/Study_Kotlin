package study.kt.study16.kt

class Srt : Train("SRT", 40_000)

fun Srt.isExpensive(): Boolean {
    println("Srt.isExpensive")

    return this.price >= 20000
}
