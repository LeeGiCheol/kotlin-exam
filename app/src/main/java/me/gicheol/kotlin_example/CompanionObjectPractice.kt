package me.gicheol.kotlin_example

class Book private constructor(val id : Int, val name : String) {
    companion object BookFactory : IdProvider {
        private const val myBook = "new book"

        fun create() = Book(getId(), myBook)

        override fun getId(): Int {
            return 10
        }
    }
}

interface IdProvider {
    fun getId() : Int
}

fun main() {
    val book = Book.BookFactory.create()
    println("${book.id} ${book.name}")

    val bookId = Book.getId()
    println("bookId = ${bookId}")
}