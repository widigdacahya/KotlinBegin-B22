var theTextLong = "Cahyadesthian"

fun main(args:Array<String>){
    println(::theTextLong.name)
    println(::theTextLong.get())
    ::theTextLong.set("Rizki Widigda")

    println()
    println(::theTextLong.get())

    ::theTextLong.let {
        theTextLong = "Cahyadesthian Rizki Widigda"
    }
    println(::theTextLong.get())
    println(theTextLong)
}