package com.dicoding.kotlin

fun main(args:Array<String>) {

    //Safe Calls ?.
    val textIsSomething: String? = null
    println(textIsSomething?.length)

    //Elvis Operator ?:
    var aTextToElvis: String? = null
    println(aTextToElvis?.length ?:100)

    //non-null assertion [gurantee it snot null to compiler]
    val demonString: String? = null
    println(demonString!!.length)
}

