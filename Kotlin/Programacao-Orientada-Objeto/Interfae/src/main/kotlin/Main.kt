interface Shape {
    fun draw()
    fun resize(factor: Double)
}

class Circle(private val radius: Double) : Shape {
    override fun draw() {
        println("Drawing circle with radius $radius")
    }

    override fun resize(factor: Double) {
        println("Resizing circle by factor $factor")
    }
}
