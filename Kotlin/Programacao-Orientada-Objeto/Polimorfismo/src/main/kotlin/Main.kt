open class Animal(val name: String) {
    open fun makeSound() {
        println("$name is making a sound")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name is barking")
    }
}

class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name is meowing")
    }
}
