fun main(args:Array<String>) {

    val myNumbers = getNumSize(1,2,3,4426,34637,4572,235,7574)
    println("THe size of myNumbers is ${getNumSize(myNumbers)}")
    println("THe size of myNumbers is ${(myNumbers)}")

    println()
    println("What about two param : ")
    var theFunctionNo = somethingVarag("Na",3)
    val otherFunOf = somethingVarag("Kotlins",10,2,134,135,235,35,134)
    println(theFunctionNo)


    println()
    theRandList(10,90,35,135,15,325,name="Cahyadesthian List")

    println()
    //memasukkan yang bentuk array
    //use spread operaotr (*)
    val newLIstDone = listOf(32,235,135,15)
    val toArrOfNewList = newLIstDone.toIntArray()
    println( getNumSize(1,134,136,*toArrOfNewList))

}

/**
 * it is useful
 * when we dont know how
 * many argument are included
 * */
fun getNumSize(vararg theNumbers: Int) : Int {
    return theNumbers.size
}

/*
* a parameter cant contain 2 parameter
* */
fun somethingVarag(kind:String, vararg aList:Int) {
    var theSizeOfIt = aList.size
    println("$kind is $theSizeOfIt")
}

fun theRandList(vararg numberss:Int, name:String) {
    println("$name : ${numberss.size}")

}