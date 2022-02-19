fun main(args: Array<String>) {
    val myOtherCat = Animal()
    println(myOtherCat.name)
    myOtherCat.name = "Bibu"
    println(myOtherCat.name)

}

class Animal {
    var name: String = "An Animal :)"
        get()  {
            println("Getter ini bous")
            return field
        }
        set(value) {
            println("Setter ni bouus!")
            field = value
        }
}