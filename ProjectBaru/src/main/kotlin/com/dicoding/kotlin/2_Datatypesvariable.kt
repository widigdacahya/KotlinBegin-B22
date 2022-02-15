package com.dicoding.kotlin

fun main(args:Array<String>) {

    /*
    * Structure
    * var identifier:Type = initialization
    *
    * > var atau val,var kita bisa mengubah nilai, val ndak bisa
    * > Identifier merupakan nama dari sebuah variabel
    * > Type, tipe data dari variabel tersebu
    * > initialization atau nilai awal dari sebuah variabel
    * */

    val firstWord = "Dicoding"
    var secondWord = "Akademy"

    secondWord = "Academy"
    println(firstWord + " " + secondWord)

    var result = 0.0
    println("\nFirst Result is $result")
    val valueA: Double = 10.3
    val valueB: Double = 89.2
    result = (valueB + valueA)
    println("Final Result is $result")


}