package playinheritance

open class AnAnimal {

    var animalName: String? = null
    var animalWeight: Double? = null
    var animalAge : Int? = null
    var animalCarnivore : Boolean? = null


    open fun eat() {
        println("$animalName taking some food, yuumy")
    }

    open fun sleep() {
        println("$animalName go to bed for Z z Z z Z")
    }

}