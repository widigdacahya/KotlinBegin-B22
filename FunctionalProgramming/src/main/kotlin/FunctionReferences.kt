fun main(ars: Array<String>) {

    val myNumbersGaje = 1.rangeTo(10)
    println(myNumbersGaje)
    val oddNumberFromGajeNum = myNumbersGaje.filterNot(::isItEven)
    println(oddNumberFromGajeNum)

}

fun isItEven(whoseNumber:Int) = whoseNumber%2==0