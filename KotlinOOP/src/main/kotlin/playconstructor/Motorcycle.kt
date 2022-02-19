package playconstructor

class Motorcycle(nameMyMotor:String, speedMyMotor: Int, yearMyMotor: Int) {

    var motorName : String? = "A Motor"
    var motorMaxSPeed : Int? = 100
    var motorOperand : Boolean? = false
    var motorYear : Int? = 2020
    var motorMirror: Int? = 2

    init {
        println("The Motor Info")

        if(nameMyMotor.isNotEmpty()) {
            this.motorName = nameMyMotor
        }
        println("Name : $motorName")

        if(speedMyMotor>0) {
            this.motorMaxSPeed = speedMyMotor
        }
        println("Max Speed : $motorMaxSPeed")

        println("Operand : $motorOperand")

        if(motorYear!=0) {
            this.motorYear = yearMyMotor
        }
        println("Year : $motorYear")

        println("Spion : $motorMirror")
    }

    constructor(bikeName:String,bikeSpeed:Int,bikeYear:Int, bikeOperand:Boolean ) : this(bikeName,bikeSpeed,bikeYear) {
        this.motorOperand = bikeOperand
    }


}