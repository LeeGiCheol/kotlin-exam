package me.gicheol.kotlin_example

fun main() {
    helloWorld()

    println(add(5, 14))
}

// 리턴 타입이 void 일 경우 리턴 타입 생략 가능
// 명시적으로 : Unit 을 작성해줘도 괜찮음
fun helloWorld() : Unit {
    println("Hello World")
}

// 리턴 타입이 void 가 아닐 경우 : 리턴타입 을 작성해줘야 한다.
// 파라미터도 동일하다.
fun add(a : Int, b : Int) : Int {
    return a + b
}

// var는 값을 변경할 수 있지만, val은 불가능하다. (상수)
// 변수의 타입은 타입 추론이 되기 때문에 명시해줘도 괜찮고, 명시하지 않아도 괜찮다.
// 만약 변수 선언만 한다면, 타입을 필수로 작성해야 한다.
fun valVal() {
    var a : Int = 10
    val b : Int = 9

    a = 100

    val c = 10
    var d = 100

    var name : String = "LEE"

    var age : Int
}