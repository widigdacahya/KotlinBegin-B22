package com.dicoding.kotlin.cahyadesthian

fun main() {
    val aTypeOfSoemthin: Any = 100.643
    when(aTypeOfSoemthin) {
        is Long -> println("It's A Long")
        is Short -> println("It's A Short")
        is Float -> println("It's A Float")
        is Double -> println("It's A Double")
        else -> println("It's Any :0")
    }
}