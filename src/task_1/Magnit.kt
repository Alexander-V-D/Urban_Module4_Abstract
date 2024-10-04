package task_1

class Magnit(size: String, productType: String, priceType: String) : Shop(size, productType, priceType) {

    override fun open() {
        println("Магнит открывается в 08:00")
    }

    override fun close() {
        println("Магнит закрывается в 22:00")
    }
}