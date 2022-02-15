package com.dicoding.kotlin

fun main() {
    val intArray = Array(10, {i-> ( i+1 )*(i+1) })
    println(intArray)
    for(anElement in intArray) {
        println(anElement)
    }
}