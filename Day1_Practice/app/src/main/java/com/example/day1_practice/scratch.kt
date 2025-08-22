package com.example.day1_practice

fun sumOfEvens(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        if (i % 2 == 0) sum += i
    }
    return sum
}

fun safeDivide(a: Int, b: Int): Double? {
    return if (b == 0) null else a.toDouble() / b
}

fun name(name: String, age: Int) {
    println("Hello my name is $name and my age is $age")
}
fun greetings(name: String) {
    println("Hello $name, How's it going")
}

fun checkMinor(age: Int) {
    if(age >= 18) {
        println("He/She is adult")
    }
    else{
        println("Minor")
    }
}

fun dayCheck(day: Int) {
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        else -> println("Other day")
    }
}

fun printNum(){
    for (i in 1..5)
    {
        println("Number $i")
    }
}

fun revNum() {
    var i: Int = 5

    while (i > 0)
    {
        println("Reverse number $i")
        i--
    }
}

fun mulNum(a: Int, b: Int): Int {
    return a * b
}

fun color(){
    val colors = mutableListOf("Red", "Blue", "Green")
    colors.add("Orange")

    for (color in colors) {
        println(color)
    }
}

fun nullValue() {
    var a: String? = null

    println(a?.length)
}

fun main() {
    println(sumOfEvens(10))  // ✅ Works in normal Kotlin file → Output: 30
    println(safeDivide(10, 2)) // 5.0
    println(safeDivide(10, 0)) // null

    //Nullable list exp
    val words: List<String>? = listOf("Hi", "Kotlin", "Compose")
    // Safely print lengths
    words?.forEach { println(it.length) }

    name("Ayush", 20)
    greetings("Ayush")

    var a = "Ayush"
    println(a)
    a = "Patel"
    println(a)

    checkMinor(19)
    revNum()
    printNum()
    dayCheck(2)

    var mul = mulNum(2, 3)
    println(mul)

    printNum()
    nullValue()
    color()
}