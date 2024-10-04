package task_1

abstract class Shop(val size: String, val productType: String, val priceType: String) {

    abstract fun open()

    abstract fun close()

    open fun getInfo() {
        println("Это $productType магазин. Его размер: $size. В этом магазине $priceType тип цен.")
    }
}