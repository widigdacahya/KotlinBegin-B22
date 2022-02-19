fun main(args: Array<String>) {


    /**
     * List biasa
     * diproses secara horzontal
     *
     * */
//    val crazyList = (1..10000000).toList()
//    crazyList.filter { it%500000==0 }
//        .map{it*2}
//        .forEach { println(it) }



    /**
     * asSequence
     * diproses secara vertikal
     *
     * */
    val seqNum = (1..1000000).toList()
    seqNum.asSequence().filter { it%500000==0 }
        .map { it*2 }
        .forEach { println(it) }


    println()
    //membuat squnce tapi tak tebatas :'v
    val theSeqInfinet = generateSequence(0) { it+1 }
    theSeqInfinet.take(10)
        .forEach { println(it) }

}