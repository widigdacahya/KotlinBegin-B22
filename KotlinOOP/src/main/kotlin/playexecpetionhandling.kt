import java.lang.NumberFormatException

fun main(args:Array<String>) {

    //val theStringThatCOnverted:String ? = null

    val userInput:String = readLine()?:""


    var valueConverted : Int = 0

    try {
        valueConverted = userInput!!.toInt()
    } catch (e:NullPointerException) {
        valueConverted = 0
    } catch (e:NumberFormatException) {
        valueConverted = -1
    } finally {
        when(valueConverted) {
            0 -> println("Catchblock from NullPointer")
            -1 -> println("Cactch block from Number FOrmat")
            else -> println(valueConverted)
        }
    }


}