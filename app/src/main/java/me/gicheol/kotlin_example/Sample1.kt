package me.gicheol.kotlin_example

import java.util.*

fun main() {
    nullCheck()
    let()
}

// 타입을 생략하거나, ?를 붙이지 않으면 nonNull
// ?를 붙이면 nullable, 타입 생략이 불가하다.
// ?: Default 값을 지정할 수 있다.
fun nullCheck() {
    val name = "lee"
    val nullName : String? = null
    val nameInUpperCase = name.uppercase()
    val nullNameInUpperCase = nullName?.uppercase()
    println("nameInUpperCase = ${nameInUpperCase}")
    println("nullNameInUpperCase = ${nullNameInUpperCase}")

    val lastName : String? = null
    val fullName = name + " " + (lastName?: "No lastname")
    println("fullName = ${fullName}")
}

// !!를 붙이면 해당 변수가 null이 아님을 컴파일러에게 알려준다.
fun ignoreNulls(str : String?) {
    val notNullVal : String = str!!
    val upper = notNullVal.uppercase()
}

// 변수가 null이 아니라면 let 구문 실행
// 변수명을 사용하거나, it 을 사용할 수 있다.
fun let() {
    val email : String? = "LEE@gmail.com"
    email?.let {
        println("email = ${email}")
        println("it = ${it}")
    }
}