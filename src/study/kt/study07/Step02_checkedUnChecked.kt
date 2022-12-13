package study.kt.study07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    readFile()
    readFileWithPath("/Users/sejunehwang/Desktop/study/Handle_Kotlin/./a.txt")
}

/**
 * kotlin에서는 checked exeption과 unchecked exception을 구분하지 않는다.
 * 모두 unchecked exception이다.
 **/

fun readFile() /** :Unit (java에서의 void, 생략 가능) **/ {
    val currentFile = File(".")
    println("file path :: ${currentFile.absolutePath}")
    val file = File(currentFile.absolutePath + "/a.txt")

    /*
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())

        reader.close()
    */

    // use inline 확장함수
    val reader = BufferedReader(FileReader(file)).use {
        reader -> println(reader.readLine())
    }
}

fun readFileWithPath(path: String) {
    val reader = BufferedReader(FileReader(path)).use {
        reader ->
        println(reader.readLine())
    }
}
