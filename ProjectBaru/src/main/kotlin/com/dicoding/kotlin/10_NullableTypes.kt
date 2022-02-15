package com.dicoding.kotlin

fun main(args:Array<String>) {

    var aText: String? = null

    if(aText!= null) {
        println("Ther is soemthing sst")
    } else {
        println("still nothing")
    }

    aText = "Wdidiidi"

    if(aText!= null) {
        println("Ther is soemthing sst")
    }else {
        println("still nothing")
    }
}