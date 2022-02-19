package playinheritance

fun main(args: Array<String>) {

    val myCatBrown = AnimalCat()
    println(myCatBrown)
    myCatBrown.sleep()
    myCatBrown.eat()
    println("Info Animal : ${myCatBrown.animalName} | ${myCatBrown.animalWeight} | ${myCatBrown.animalCarnivore} | ${myCatBrown.animalAge}")

    println()
    myCatBrown.animalName = "Cemeng"
    myCatBrown.animalWeight = 42.1
    myCatBrown.animalCarnivore = true
    myCatBrown.animalAge = 1

    myCatBrown.catPlay()
    myCatBrown.sleep()
    myCatBrown.eat()
    println("Info Animal : ${myCatBrown.animalName} | ${myCatBrown.animalWeight} | ${myCatBrown.animalCarnivore} | ${myCatBrown.animalAge}")

}