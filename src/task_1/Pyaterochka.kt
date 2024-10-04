package task_1

class Pyaterochka(size: String, productType: String, priceType: String) : Shop(size, productType, priceType) {

    override fun open() {
        println("Пятерочка открывается в 09:00")
    }

    override fun close() {
        println("Пятерочка закрывается в 23:00")
    }

}