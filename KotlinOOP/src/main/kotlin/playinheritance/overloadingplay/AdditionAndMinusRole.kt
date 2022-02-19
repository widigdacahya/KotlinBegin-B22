package playinheritance.overloadingplay

class AdditionAndMinusRole {

    fun addition(val1: Int, val2: Int) = val1 + val2
    fun addition(val1: Int, val2: Int, val3: Int) = val1 + val2+val3
    fun addition(double1: Double, double2: Double) = double1 + double2
    fun addition(valFloat1: Float, valFloat2: Float) = valFloat1 + valFloat2

    fun subtraction(val1:Int, val2:Int) = if(val1<val2) val2-val1 else val1-val2
    fun subtraction(val1:Double, val2:Double) = if(val1<val2) val2-val1 else val1-val2

}