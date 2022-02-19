fun main(args: Array<String>) {
    val iyaApaBedannya = buildStin()
    println(iyaApaBedannya)

    println()
    val myMessageFromHaven = newBuildString {
        append("Hello ")
        append("From ")
        append("A LAmbda called String Builder?")
    }
    println(myMessageFromHaven)
}

fun buildStin() : String {
    val theStringBuilder = StringBuilder()
    theStringBuilder.append("Hai ")
    theStringBuilder.append("dari " )
    theStringBuilder.append("Lambda")
    return theStringBuilder.toString()
}

fun newBuildString(action: StringBuilder.()->Unit): String {
    val myStringBuilder = StringBuilder()
    myStringBuilder.action()
    return myStringBuilder.toString()
}