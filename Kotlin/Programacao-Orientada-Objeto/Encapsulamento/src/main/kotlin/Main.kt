class Person(private val name: String, private var age: Int) {
    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }

    fun setAge(newAge: Int) {
        if (newAge >= 0) {
            age = newAge
        }
    }
}
