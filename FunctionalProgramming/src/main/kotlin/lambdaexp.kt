fun main(args: Array<String>) {
    println("I have a message, the message is Cahyadesthian")
    println("it lenght is ${printMsgLength("Cahyadesthian")}")
}

val printMsgLength = {messageSentece:String -> messageSentece.length}