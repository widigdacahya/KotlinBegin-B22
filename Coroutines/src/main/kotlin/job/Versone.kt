package job

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    val theJob = launch(start = CoroutineStart.LAZY) {
        delay(10000L)
        println("Starting new Job")
    }

    theJob.start()
    println("Other Task Here")
}