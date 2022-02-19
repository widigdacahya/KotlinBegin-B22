fun main(args: Array<String>) {

    val myPeppa = Binatang("Peppa", 9.0,1,true)
    println("We have a new cat!")
    println("Name : ${myPeppa.name} , weight : ${myPeppa.weight}, age : ${myPeppa.age}")
    myPeppa.eat()
    myPeppa.sleep()

}

class Binatang(val name:String, val weight:Double, val age:Int, val isMamal: Boolean) {

    fun eat() {
        println("$name feed this yummy food :D")
    }

    fun sleep() {
        println("$name let's play lullaby! :*")
    }

}