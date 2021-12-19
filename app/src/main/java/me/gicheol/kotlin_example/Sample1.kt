package me.gicheol.kotlin_example

fun main() {
    forAndWhile()
}

fun forAndWhile() {
    val users = arrayListOf("LEE", "GICHEOL", "ABC")

    for (user in users) {
        println("user = ${user}")
    }

    for (i in 0..2) {
        println("users[${i}] = ${users[i]}")
    }

    var sum = 0
    for (i in 1..10) {
        sum += i
    }

    println("sum = ${sum}")

    // 1 ~ 99 까지
    sum = 0
    for (i in 1 until 100) {
        sum += i
    }

    println("sum = ${sum}")

    for (i in 10 downTo 1) {
        println("i = ${i}")
    }

    for ((index, name) in users.withIndex()) {
        println("${index+1}번째 = ${name}")
    }

    var index = 0
    while(index < 10) {
        println("index = ${index}")
        index++
    }
}