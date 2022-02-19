fun main(args: Array<String>) {

    println(theSentence())
    println(theSentence(last = "Amazing"))

}

fun theSentence(
    first:String = "Kotlin",
    middle: String = "Is",
    last: String = "Awesome") : String {

    var theSentece = "My text is $first $middle $last"

    return theSentece

}