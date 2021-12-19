package me.gicheol.kotlin_example

fun main() {
    println(max(1, 5))
    println(max2(5, 10))
    println(max3(10, 15))
    checkNum(1)
    checkNum2(1)
    checkNum3(1)
}

fun max(a : Int, b : Int) : Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun max2(a : Int, b : Int) : Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun max3(a : Int, b : Int) = if (a > b) a else b

// else 는 필수가 아니다.
fun checkNum(score : Int) {
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }
}

// else 는 필수이다.
fun checkNum2(score : Int) {
    var a = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("a : ${a}")
}

fun checkNum3(score : Int) {
    when (score) {
        in 90..100 -> println("You are Good")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}