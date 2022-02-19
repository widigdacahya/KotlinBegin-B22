package job

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {

    val job = launch(start = CoroutineStart.LAZY) {
        delay(5000L)
        println("The Job is started here :D")
    }

    job.join()
    println("Other Tasks are running")

}