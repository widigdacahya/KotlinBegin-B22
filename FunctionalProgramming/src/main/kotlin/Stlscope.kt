
/**
 * let,run,with,apply,also
 *
 * run,with,apply
 * use (THIS)
 *
 * let,also
 * use(IT)
 *
 * */

fun main(args:Array<String>) {

    //[RUN]
    val yourtext = "Hai"
    var theTextResult = yourtext.run {
        val former = this
        val changeTo = this.replace("Hai", "Eyoouw")
        "Text changed from $former become $changeTo"
    }
    println(yourtext)
    println(theTextResult)

    println()
    //[WITH]
    val sebuahPesan = "Hai Kotlin <3"
    val sebuahResult = with(sebuahPesan) {
        println("Ini Pesannya $this")
        println("Pesan itu punya ${this.length} karater")
    }

    println()
    //[APPLY]
    //dari yang bentuknya kek gini
    val builderString = StringBuilder()
    builderString.append("Hai ")
    builderString.append("Meong!")
    println(builderString)
    println(builderString.toString())

    println()
    //bisa jadi gini, dengan menggunakan apply
    val merakitPesan = StringBuilder().apply{
        append("Hello ")
        append("Wordl! Meet my new Me!" )
    }
    println(merakitPesan)

    println()
    //[LET]
    //mengakses konteks dari sebuah objek
    val theSenteceFromSomeone: String? = null
    theSenteceFromSomeone?.let {
        val theStcLen = it.length
        println("text length is $theStcLen")
    } ?: run {
        println("The Sentece is nothin")
    }


    println()
    //[ALSO]
    //pakai it
    val theTextFromAnyone = "Yow you are awesome"
    val thatSenteceLengght = theTextFromAnyone.also {
        println("$theSenteceFromSomeone has length ${it.length}")
    }

    println("The Text is $thatSenteceLengght")

}
