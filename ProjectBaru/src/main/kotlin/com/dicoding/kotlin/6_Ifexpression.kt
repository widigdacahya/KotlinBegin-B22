package com.dicoding.kotlin

fun main(args:Array<String>) {

    val openHrs = 7
    var nowTime = 0
    val closeHrs = 21
    val office = if(nowTime==7) {
        "Will open very soon! Just wait :D"
    } else if(nowTime>openHrs && nowTime<= closeHrs) {
        "Welcome, Office Open now"
    } else {
        "Sorry, Office was CLosed"
    }
    println(office)
}