fun main(args: Array<String>) {
    100.printInt()
    println(90.plusFive())
    val myNum = 91
    println(myNum.slice)
}

/**
 * Extension Function
 * */
fun Int.plusFive(): Int {
    return this+5
}


fun Int.printInt() {
    println("The value is $this")
}


/**
 * Extension Properties
 *
 */
val Int.slice:Int
    get() = this /2
