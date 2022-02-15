package com.dicoding.kotlin.cahyadesthian

fun main(args: Array<String>) {
    val aRanges = 1.rangeTo(20) step 2
    println(aRanges)
    for(aNumber in aRanges) {
        print("$aNumber " )
    }
    println("\n")

    println("withIndex")
    val theRangedInt = 1..20 step 4
    for( (index,value) in theRangedInt.withIndex() ) {
        println("The value : $value | index: $index")
    }
    println()

    println("ForEach")
    theRangedInt.forEach{
        println("The value is $it")
    }
    println()

    println("ForEach with Index")
    theRangedInt.forEachIndexed{ indexOf,valueOf ->
        println("The value $valueOf is $indexOf")
    }
    println()

    /*
    *
    *  Jika kita hanya ingin menggunakan argumen index,
    * maka kita bisa mengubah argumen value menjadi _
    *
    * */
    println("ForEach with Index only index, other change to _")
    val theSequence = 0..10
    theSequence.forEachIndexed {theIndex,_ ->
        println("IndexAvailable : $theIndex")
    }

}