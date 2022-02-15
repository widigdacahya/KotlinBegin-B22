package com.dicoding.kotlin.cahyadesthian

fun main(args:Array<String>) {

    var listOfInt = arrayListOf(1,2,3,4,null,6,7,8)
    for(i in listOfInt) {

        if(i!=null) {
            print("$i ")
        }

    }


    println()
    var theBreaker = "Stop"
    val listOfWord = arrayListOf("Laptop","Mouse", "Cigaretes", "Table", "Tipe X", "Stop", "Pecil Case", "Handphone")


    for(word in listOfWord) {
        if(word == theBreaker) {
            break
        } else {
            print(" $word ")
        }
    }
    println()

    for(word in listOfWord) {
        if(word == theBreaker) {
            continue
        } else {
            print(" $word ")
        }
    }
    println()

}