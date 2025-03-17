package com.example.semana1ejerciciosconsola

fun main() {
    println("Subtract two numbers")

    println("Insert the first number")
    val firstNumber: Int = readln().toInt()

    println("Insert the second number")
    val secondNumber: Int = readln().toInt()

    val subtract: Int = firstNumber.minus(secondNumber)

    println("This is the result: $subtract")
}
