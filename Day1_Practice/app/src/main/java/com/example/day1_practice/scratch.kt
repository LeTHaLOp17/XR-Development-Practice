package com.example.day1_practice

//fun sumOfEvens(n: Int): Int {
//    var sum = 0
//    for (i in 1..n) {
//        if (i % 2 == 0) sum += i
//    }
//    return sum
//}
//
//fun safeDivide(a: Int, b: Int): Double? {
//    return if (b == 0) null else a.toDouble() / b
//}
//
//fun main() {
//    println(sumOfEvens(10))  // ✅ Works in normal Kotlin file → Output: 30
//    println(safeDivide(10, 2)) // 5.0
//    println(safeDivide(10, 0)) // null
//
//
//    //Nullable list exp
//    val words: List<String>? = listOf("Hi", "Kotlin", "Compose")
//    // Safely print lengths
//    words?.forEach { println(it.length) }
//}

fun name(name: String, age: Int) {
    println("Hello my name is $name and my age is $age")
}

fun main() {
    name("Ayush", 20)
    greetings("Ayush")

    var a = "Ayush"
    println(a)
    a = "Patel"
    println(a)
}

fun greetings(name: String) {
    println("Hello $name, How's it going")
}
