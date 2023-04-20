open class Animal(val name: String) {
    fun sleep() {
        println("$name is sleeping")
    }
}

class Dog(name: String) : Animal(name) {
    fun bark() {
        println("Woof! My name is $name")
    }
}
