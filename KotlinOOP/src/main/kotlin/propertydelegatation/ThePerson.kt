package propertydelegatation

class ThePerson {
    var personName: Any by DelegateGeneriClass()
    var personWeight : Any by DelegateGeneriClass()
    var personAge: Any by DelegateGeneriClass()
}