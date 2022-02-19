fun main(args: Array<String>) {

    //Collection that save in format
    //Key-Value
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    /*
    * TO get valur we can use like indexing
    * and .getValue
    *
    * the difference is
    * indexing can tolerate null
    * whereas getVlue throw exception
    *
    * */

    println("Jakarta is Capital of ${capital["Jakarta"]}")
    println("New Delhi is city on ${capital.getValue("New Delhi")}")

    println()
    println("all key is ${capital.keys}")
    println("All values are ${capital.values}")


}