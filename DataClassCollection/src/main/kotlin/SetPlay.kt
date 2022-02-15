fun main(args: Array<String>) {
    var mySet = setOf(1,2,"No", "It COuld", true , null, false)
    var myNotSet = mutableSetOf<String?>()

    println()
    println("mySet (setOf) : ")
    println(mySet)
    println()
    println("myNotSet (mutableSetOf) : ")
    println(myNotSet)

    myNotSet.add("Hmmm whatsde difference ya")
    var myPsstList = listOf("donktkow", "maybe ", "hmmm")
    myNotSet.addAll(myPsstList)
    println()
    println("myNotSet (mutableSetOf) afterr add : ")
    println(myNotSet)


}
