fun main(args: Array<String>) {
    prinResMulByTwo(20, sumTwoNum )
}

var sumTwoNum:(Int) -> Int = { aValue -> aValue*2 }

//this is HOF
fun prinResMulByTwo(aValueOfIt: Int, sumTwoNum: (Int)->Int) {
    val resultOf = sumTwoNum(aValueOfIt)
    println(resultOf)
}