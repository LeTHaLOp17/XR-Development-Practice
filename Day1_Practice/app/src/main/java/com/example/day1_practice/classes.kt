package com.example.day1_practice

//
//class car(val brand: String, val year: Int) {
//    fun details() {
//        println("This car is a $brand, made in $year")
//    }
//}

open class Shape {
    open fun area(): Int {
        return 0 // Base class: no area
    }
}

class Rectangle(val width: Int, val height: Int): Shape() {
    override fun area(): Int {
        return width * height
    }
}

//data class Book(val title: String, val author: String) {
//    val myBook = Book("Kotlin Basics", "Ayush")
//}

fun main(){
    // Car example
//    val urus = Car("Lamborghini", 2020)
//    urus.details()

    // Rectangle example
    val rect = Rectangle(5, 6)
    println("Rectangle area: ${rect.area()}")

    // Book data class
//    val myBook = Book("Kotlin Basics", "Ayush")
//    println(myBook)

}