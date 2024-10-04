package task_2

class Student(firstName: String, lastName: String, age: Int, val course: Int) : Person(firstName, lastName, age) {

    override fun toWork() {
        println("Студент учится на $course курсе")
    }

    override fun toRest() {
        println("Студент отдыхает после учебы")
    }

}