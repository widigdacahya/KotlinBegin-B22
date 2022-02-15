package com.dicoding.kotlin

fun main(args:Array<String>) {

    val aUser = setUser("Prameswari", 22)
    println(aUser)

    println()
    val nameOfSomeone = "Agniasari Gendhis Widyaningsih"
    printUserGreet(nameOfSomeone)

    println()
    println(aUser)


}

fun setUser(namaOfUser:String, ageOfUser:Int ) = "Hello $namaOfUser who was $ageOfUser y.o"

fun printUserGreet(name:String) {
    println("Good mowning $name")
}