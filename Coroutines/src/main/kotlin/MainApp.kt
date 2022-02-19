import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {

    launch{
        delay(3000L)
        println("Coroutines here!")
    }
    println("Heyyouw")
    delay(1000L)

}