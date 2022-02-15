package com.dicoding.kotlin.cahyadesthian

fun main(args:Array<String>) {

    var aCharBig = 'A'
    var aCharSmall = 'a'

    do {
        print(aCharBig + " ")
        aCharBig++
    } while (aCharBig<='Z')

    println()
    while (aCharSmall <= 'z') {
        print("$aCharSmall ")
        aCharSmall++
    }

}