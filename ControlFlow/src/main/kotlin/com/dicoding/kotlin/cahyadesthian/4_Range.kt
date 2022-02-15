package com.dicoding.kotlin.cahyadesthian

fun main(args: Array<String>) {


    val rangeIntOneToTen = 1..10
    println(rangeIntOneToTen)
    rangeIntOneToTen.forEach { num ->
        print("$num ")
    }


    println("\n")
    val rangeIntTenToOne = 10.downTo(1)
    println(rangeIntTenToOne)
    rangeIntTenToOne.forEach { nums ->
        print("$nums ")
    }

    println("\n")
    val aCharFromAtoF = 'A'..'F'
    val aCharfromatof = 'a'.rangeTo('f')
    println("The big one : ")
    aCharFromAtoF.forEach{
        print( "$it ")
    }

    println("\nThe small one : ")
    aCharfromatof.forEach{
        print( "$it ")
    }
    println()

}