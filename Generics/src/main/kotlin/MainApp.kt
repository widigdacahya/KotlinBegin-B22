fun main(args: Array<String>) {

//    val theLongArrayListOfMine = ArrayList<Long>()
//    //val thLongNum = 99999999..1010808087498
//    println(theLongArrayListOfMine[0])

    val theBlackBoxOfCahya = MyBox<String>()
    theBlackBoxOfCahya.displayInsideBox("A Surprise")

}


class MyBox<TheGenericHolder> {
    fun displayInsideBox(item:TheGenericHolder) {
        println(item)
    }
}



