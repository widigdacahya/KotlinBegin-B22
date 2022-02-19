package playinterface

class Bird : IFly {
    override var numberOfWings: Int = 0
        get() = 2
        set(value) {
            field = 2
        }


    override fun Fly() {
        println("A Bird is Flying wing wing wing. The bird fling with $numberOfWings wings")
    }

}