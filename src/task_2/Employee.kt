package task_2

class Employee(firstName: String, lastName: String, age: Int, val profession: String) :
    Person(firstName, lastName, age) {

    override fun toWork() {
        println("$profession работает")
    }

    override fun toRest() {
        println("Работник отдыхает")
    }
}