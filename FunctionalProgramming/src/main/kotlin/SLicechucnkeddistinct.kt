fun main(args:Array<String>) {

    val myAwesomeListOfAngka = 1.rangeTo(100).toList()
    val theSlicerStep10 = myAwesomeListOfAngka.slice(0..99 step 10)
    println(theSlicerStep10)

    //disticnt to execute the same number
    val theAngkaList = listOf(1,1,1,1,2,4,4,5,2,6,3,32,432,31,5)
    val theAngkaListunique = theAngkaList.distinct()
    println()
    println(theAngkaListunique)


    val something = listOf(
        theSomething(1,"Cahya"),
        theSomething(2,"Cahyadesthian"),
        theSomething(1, "Dido"),
        theSomething(4,"Rizki"),
        theSomething(5,"Widigda")

    )
    val theDisticntWord = something.distinctBy { it.aKey }
    theDisticntWord.forEach {
        println("The key ${it.aKey} with the value ${it.theMsg}")
    }


    println()
    //chunked take a part, and leave some part with
    var theWord = "Afacadafra"
    var otherWord = "Afacadaffra"
    var chunkedWord = theWord.chunked(2)
    var otherWordChunked = otherWord.chunked(2)
    println(chunkedWord)
    println(otherWordChunked)

}

data class theSomething(val aKey: Int, val theMsg: String)