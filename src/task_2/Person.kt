package task_2

abstract class Person(val firstName: String, val lastName: String, val age: Int) {

    abstract fun toWork()

    abstract fun toRest()

    open fun getInfo() {
        println("Имя: $firstName $lastName. Возраст: $age")
    }

}