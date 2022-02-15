package com.dicoding.kotlin

fun main() {

    var magicalNumber = 10
    val myNumber = 1
    println("There is a magic number, it is $magicalNumber, and if your " +
            "number are less than it, it mean good," +
            "and if your number greater than it" +
            ".It also good, your number :" +
            " ${if (myNumber>magicalNumber)
                "is $myNumber" else "was $myNumber"} is awesome ")

}