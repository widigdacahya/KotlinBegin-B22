fun main(args:Array<String>) {

    var myOneVal: Int? = null
    var secondMyNum : Int? = null

    println(myOneVal.sliceBy2)
    println(secondMyNum.bagi2)

}

val Int?.sliceBy2 : Int
    get() = this?.div(2)?:0

val Int?.bagi2 : Int?
    get() = this?.div(2)