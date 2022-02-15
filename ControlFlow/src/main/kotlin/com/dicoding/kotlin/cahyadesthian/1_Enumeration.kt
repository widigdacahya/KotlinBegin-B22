package com.dicoding.kotlin.cahyadesthian

fun main(args:Array<String>) {

    val myPrinterColor: Array<Color> = enumValues()
    myPrinterColor.forEach { color ->
        println(color)
    }

    println()
    val myFavInPrinterColor:Color = enumValueOf("BLUE")
    println(myFavInPrinterColor)
    println("The position is ${myFavInPrinterColor.ordinal}")

    println()
    val aTiger : MyPet = MyPet.Alex
    println(aTiger)
    println(aTiger.kind)
}

enum class Color(val value:Int) {
    RED(0xFF0000),
    GREEN(0x00ff00),
    BLUE(0x0000FF)
}

enum class MyPet(val kind:String) {

//    abstract fun printVal()

    Peppa("Cat"),
    Rudolf("Wolf"),
    Alex("Tiger")
}