fun main(args: Array<String>) {
    println(theFactorial(5))
}

tailrec fun theFactorial(n:Int, resultOf: Int = 1): Int {
    val newResultFact = n* resultOf
    return if(n==1) newResultFact else theFactorial(n-1,newResultFact)
}