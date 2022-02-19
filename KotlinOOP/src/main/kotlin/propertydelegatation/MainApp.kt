package propertydelegatation

fun main(args:Array<String>) {

    var Padmasari = ThePerson()
    println(Padmasari)
    println("Name : " + Padmasari.personName)
    println("Age : ${Padmasari.personAge}")
    println("Weight : ${Padmasari.personWeight}")

    Padmasari.personName = "Padmasari Gendhis Pramewswari"
    Padmasari.personAge = 10
    Padmasari.personWeight = 56.2
    println()
    println("After little change")
    println("Name : " + Padmasari.personName)
    println("Age : ${Padmasari.personAge}")
    println("Weight : ${Padmasari.personWeight}")
}