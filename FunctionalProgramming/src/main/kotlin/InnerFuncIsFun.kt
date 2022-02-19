import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    println(sum(1,5,6))
    //println(sum(0,2,1))
}

fun sum(valueA: Int, valueB:Int, valueC:Int): Int {

    fun checNum0(aValueCome:Int) {
        if (aValueCome == 0)
            throw IllegalArgumentException("Value musnt 0 pls ;)")
    }

    checNum0(valueA)
    checNum0(valueB)
    checNum0(valueC)

    return (valueA+valueB+valueC)
}