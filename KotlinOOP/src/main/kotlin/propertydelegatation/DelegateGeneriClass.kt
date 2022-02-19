package propertydelegatation

import kotlin.reflect.KProperty

class DelegateGeneriClass {
    private var theValue : Any = ""

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("This function will act like getter for property ${property.name} pada class $classRef")
        return theValue
    }

    operator fun setValue(classRef: Any, property: KProperty<*> , newValue:Any) {
        println("Nilai ${property.name} dari $theValue change to $newValue")
        theValue = newValue
    }


}

//class Person {
//    var personName: Any by DelegateGeneriClass()
//
//
//}