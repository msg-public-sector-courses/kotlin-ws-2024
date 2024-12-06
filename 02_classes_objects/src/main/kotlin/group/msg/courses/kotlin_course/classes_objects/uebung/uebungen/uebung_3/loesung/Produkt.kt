package group.msg.courses.kotlin_course.classes_objects.uebung.uebungen.uebung_3.loesung

data class Produkt(val id: Int, val name: String, val preis: Double)

object Database {
    private val products = mutableListOf<Produkt>()

    fun addProduct(product: Produkt) {
        products.add(product)
    }

    fun printProducts() {
        for (product in products) {
            println(product.name)
        }
    }
}

