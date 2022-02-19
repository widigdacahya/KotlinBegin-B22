fun main(args: Array<String>) {
    /**
     *
     * Filter() dan filterNot()
     *
     * */
    val myNumberList = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val evenNumber = myNumberList.filter { it%2 == 0 }
    val oddNumber = myNumberList.filterNot { it%2 == 0  }

    println("My Number list is")
    println(myNumberList)

    print("\n")
    print("Even Num : $evenNumber")

    println()
    println("Odd Num : $oddNumber")

    /**
     * Map
     * make new collection with certain conditon
     * */
    val mulBy2 = myNumberList.map { it*2 }
    println()
    println("Map My Number to List, so it would make new collection")
    println("It map to new collection that multiplied current list to twice")
    println(mulBy2)


    /**
     * Count()
     *
     * */
    println()
    println("Count  how many element")
    println("Odd num : $oddNumber")
    println("How manny el in Odd num? ${oddNumber.count()}")
    println("How many it kelipatan 3 : ${oddNumber.count{it%3==0}}")
    val oddSonofTHree = oddNumber.map { it%3 == 0 }
    println("Those are : $oddSonofTHree")

    /**
     *
     * Find, firOrNull(), lastOrNull()
     *
     * */
    println()
    val thNumOddTest = listOf(1,2,4,5,6,7,8,9)
    val theNumChildOfThree = thNumOddTest.find { it%3 == 0 }
    println("Find() kelipatan 3")
    println(theNumChildOfThree)
    println()
    println("LastOrNull()")
    println(thNumOddTest.last())
    println(thNumOddTest.last{it%8==0}  )
    println(thNumOddTest.lastOrNull{it%10==0}  )

    /**
     * sum()
     * */
    println()
    val theListOfNewNumEa = arrayListOf(1,2,3,4,5)
    println(theListOfNewNumEa.sum())

    /*
    * SOrted
    * */
    println()
    val myCharList= listOf('a','a','h','c','y')
    println("i have char list : $myCharList")
    println("Lets sort it : ${myCharList.sorted()}")
    println("How if we sortDes : ${myCharList.sortedDescending()}")


}
