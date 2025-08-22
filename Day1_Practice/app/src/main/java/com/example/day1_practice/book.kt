package com.example.day1_practice

data class Book(val title: String, val author: String)
val myBook = Book("Kotlin Basics", "Ayush")

fun main() {
    println(myBook) // Output: Book(title=Kotlin Basics, author=Ayush)
}