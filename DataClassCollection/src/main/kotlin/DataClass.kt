fun main(args: Array<String>) {

    //see the difference between class and data class
    var aUser = User("Widigda",22)
    var aDataUser = DataUser("Padmasari", 22)

    println("User Class $aUser")
    println("Data Class DataUser $aDataUser")

    println()
    println(aUser.toString())

    val dataUser1 = DataUser("Agniasari", 22)
    val dataUser2 = dataUser1.copy(name="Kartika")
    println()
    println("Data User 1 : $dataUser1")
    println("Data User 2 : $dataUser2")

    /*
    * [Destructuring Declaration]
    * proses memetakan objek menjadi sebuah variabel
    * componentN()
    * */
    val (namaSesorang, umurSeseorang) = dataUser2
    println()
    println(namaSesorang)
    println(umurSeseorang)
}

class User(val name:String, val age:Int) {
}

data class DataUser(val name: String, val age: Int)