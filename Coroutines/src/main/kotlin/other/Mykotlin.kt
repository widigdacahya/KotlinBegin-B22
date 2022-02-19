package other

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(args:Array<String>) = runBlocking {

    //it siad async looks faster
    val timeOne = measureTimeMillis {
        val capOne = getCapital()
        val incOne = getIncome()
        println("First Way res is capital $capOne | income $incOne | profit ${incOne-capOne}")
    }

    val secondTime = measureTimeMillis {
        val capOneSecWay = async { getCapital() }
        val incOneSecWay = async { getIncome() }
        println("Second Way res is capital ${capOneSecWay.await()} | income ${incOneSecWay.await()} | profit ${incOneSecWay.await()-capOneSecWay.await()}")
    }


    println("Time 1 No Astinc : $timeOne | Time 2 WIth async : $secondTime")

}

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}