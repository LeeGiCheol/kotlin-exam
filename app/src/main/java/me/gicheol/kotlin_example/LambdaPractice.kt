package me.gicheol.kotlin_example;

// 람다의 정의 방법
// val lambdaName : Type = { argumentList -> Body }
fun main() {
    println(square(10))
    println(nameAge("LEE", 26))

    val a = "LEE said"
    println(a.pizzaIsGreat())

    println(extendString("LEE", 26))

    println(calculateGrade(455))


    val lambda = {
        number : Double -> number == 5.2345
    }

    println(invokeLambda(lambda))
    println(invokeLambda({ it > 3.22 }))
    println(invokeLambda { it > 3.22 })

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


// 람다의 Return
val calculateGrade : (Int) -> String = {
    when (it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법
fun invokeLambda(lambda : (Double) -> Boolean) : Boolean {
    return lambda(5.2345);
}