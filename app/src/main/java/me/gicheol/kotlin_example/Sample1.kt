package me.gicheol.kotlin_example

fun main() {
}

// List, MutableList
// List 는 Immutable 이지만 Array, ArrayList 는 Mutable 이다
fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)
    val array2 = arrayOf(1, 2L, "3")
    val list2 = listOf(1, 2L, "3")

    array[0] = 3

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}