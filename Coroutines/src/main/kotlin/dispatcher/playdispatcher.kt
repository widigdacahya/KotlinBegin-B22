package dispatcher

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking <Unit> {

    val theDispatcher = newFixedThreadPoolContext(4,"ThePool")

    launch(theDispatcher) {
        println("Statring in ${Thread.currentThread().name}")
        delay(4000L)
        println("Resumin in ${Thread.currentThread().name}")
    }

}