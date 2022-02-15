package com.dicoding.kotlin

fun main(args:Array<String>) {
    val openOfficeHrs = 7
    val closeOfficeHrs = 23
    val nowMyTime = 12
    var isOpen = true
    val officeCondition = if(nowMyTime>openOfficeHrs && nowMyTime<closeOfficeHrs) {
        "Welcome Sir :D"
    } else if(nowMyTime>closeOfficeHrs || nowMyTime<openOfficeHrs) {

        "Need to Go home"
    } else {
        "Wait a minute, What are this :D"
    }

    println(officeCondition)
    if(officeCondition=="Need to Go home") {
        isOpen=false

        if (!isOpen) {
            println("Come Back tomorrow ! ")
        } else {
            println("Yi yiyiyi")
        }
    }



}