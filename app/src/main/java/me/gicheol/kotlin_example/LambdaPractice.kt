package me.gicheol.kotlin_example;

// 람다의 정의 방법
// val lambdaName : Type = { argumentList -> Body }
fun main() {
    println(square(10))
    println(nameAge("LEE", 26))

    val a = "LEE said"
    println(a.pizzaIsGreat())

    println(extendString("LEE", 26))
}

val square : (Int) -> (Int) = {
    number -> number * number
}

val square2 = {
    number : Int -> number * number
}

val nameAge = { name : String, age : Int -> "my name is ${name} I'm ${age}" }


// 확장함수
val pizzaIsGreat : String.() -> String = {
    "$this Pizza is the best!"
}

fun extendString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String = { "I am ${this} and ${it} years old" }
    return name.introduceMyself(age)
}