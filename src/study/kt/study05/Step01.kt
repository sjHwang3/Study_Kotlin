package study.kt.study05

import java.lang.IllegalArgumentException

fun main() {
    // if
    /**
     *
     * if(조건){
     *
     * }
     **/

    // expression statement
    // expression: 하나의 값으로 도출되는 문장.
    // statement: 프로그램의 문장, 하나의 값으로 도출되지 않는다.
    var score = 30 + 40; // 하나의 결가가 나오며, Expression이면서 statement

    // java에서는 if문은 statement이기 때문에 바로 변수에 대입해서 사용할 수가 없다.
    // 사용하려면 삼항 연산자를 사용하여야한다.
    // 하지만, kotlin에서의 if문은 expression이기 때문에 변수에 대입하여 사용할 수 있다.
    // 따라서 kotlin에서 삼항연산자를 사용하지 않는다.
    val grade: String = if(score >= 50) {
        "P"
    } else {
        "F"
    }

    val scoreGrade1: String =
        if(score >= 90){
            "A"
        } else if(score >= 80) {
            "B"
        } else if(score >= 70) {
            "C"
        } else if(score >= 60) {
            "D"
        } else if(score >= 50) {
            "E"
        } else {
            "F"
        }

    val scoreGrade2: String =
        if(score in 90..100){
            "A"
        } else if(score in 80..89) {
            "B"
        } else if(score in 70..79) {
            "C"
        } else if(score in 60..69) {
            "D"
        } else if(score in 50..59) {
            "E"
        } else {
            "F"
        }

    // switch when
    /**
     * JAVA Switch
     * switch(변수) {
     *   case "조건" :
     *    break;
     *   default :
     *    break;
     * }
     **/
    // 자바에서는 switch 사용하였으나, 코틀린에서는 switch가 사라지고 when이 등장했다.
    val scoreGrade3: String = when(score / 10){
        9 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        5 -> "E"
        else -> "F"
    }

    val scoreGrade4: String = when(score){
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        in 50..59 -> "E"
        else -> "F"
    }

    println("Scroe:: $score / Grade: $grade / ScoreGrade $scoreGrade1 / ScoreGrade $scoreGrade2 / ScoreGrade $scoreGrade3 / ScoreGrade $scoreGrade4");
}

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }




}

fun getPassOrFail(score: Int): String {
    if(score >= 50){
        return "P"
    } else {
        return "F"
    }
}
