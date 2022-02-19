fun main(args:Array<String>) {

    /**
     * [FOLD]
     * cuma kek megang nilai tertentu
     * butuh 2 paremeter
     * 1 untuk yg di fold(dipegang)
     * 1 item di listnya
     * */
    val myListFilledbyNum = listOf(1,2,3)
    val iHaveFold = myListFilledbyNum.fold(190) {item, current ->
        println("Current $current")
        println("Item $item")
        println()
        item+current
    }

    println(myListFilledbyNum)
    println(iHaveFold)

    /**
     * [DROP]
     * memangkas item
     *
     * */
    val theNumItem = listOf(85,35,65,32)
    val mySpecial = theNumItem.drop(3)
    println()
    println(mySpecial)

    /**
     * [TAKE]
     * mengambil
     * */
    val myOtherSpecial = theNumItem.take(1)
    println()
    println(myOtherSpecial)

}