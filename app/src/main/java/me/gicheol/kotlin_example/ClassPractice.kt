package me.gicheol.kotlin_example

class ClassPractice {
}

open class Human constructor(val name : String = "Anonymous") {
    init {
        println("New human has benn born!")
    }

    constructor(name : String, age : Int) : this(name) {
        println("name = ${name}, ${age} years old")
    }

    fun eating() {
        println("Eating food")
    }

    open fun singASong() {
        println("lalala")
    }

}

class Korean : Human() {
    override fun singASong() {
        println("라라라")
    }
}


fun main() {
    val human = Human("LEE")
    human.eating()
    println("This human name is ${human.name}")

    val human2 = Human()
    println("human2 = ${human2.name}")

    val human3 = Human("GICHEOL", 26)
    human3.singASong()

    val human4 = Korean()
    human4.singASong()
}