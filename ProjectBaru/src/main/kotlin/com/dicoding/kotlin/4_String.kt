package com.dicoding.kotlin

fun main() {
    val aText = "Dicoding Kotlin Class"

    for(char in aText) {
        print("$char ")
    }



    println()
    //escaping \
    println("Cahya is \"awesome\"")


    println()
    //Straw
    val line = """
        Line1 : Cahyadesthian
        Line2 : Rizki "no escaping backslash"
        Line3 : Widigda
    """.trimIndent()
    println(line)
}