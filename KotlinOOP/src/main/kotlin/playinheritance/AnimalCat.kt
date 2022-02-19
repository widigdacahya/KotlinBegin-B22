package playinheritance



class AnimalCat: AnAnimal() {
    fun catPlay() {
        println("Miaw miaw grrrr, i Am A Playing Cat")
    }

    override fun eat() {
        println("$animalName eating tuna food")
    }
}