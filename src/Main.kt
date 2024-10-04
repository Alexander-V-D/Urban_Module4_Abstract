fun main() {

}

//Функция для задачи 3
fun convertMetersTo(meters: Double, measurementUnit: Int): Double {
    return when(measurementUnit) {
        1 -> meters * 10 //Дециметры
        2 -> meters * 0.001 //Километры
        4 -> meters * 1000 //Миллиметры
        5 -> meters * 100 //Сантиметры
        else -> meters
    }
}