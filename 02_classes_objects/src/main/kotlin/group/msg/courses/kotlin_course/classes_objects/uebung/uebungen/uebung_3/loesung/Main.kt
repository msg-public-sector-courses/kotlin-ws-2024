package group.msg.courses.kotlin_course.classes_objects.uebung.uebungen.uebung_3.loesung

fun main() {
    val produkt1 = Produkt(1, "Zahnbuerste", 1.99)
    val produkt2 = Produkt(2, "Seife", 0.99)
    Database.addProduct(produkt1)
    Database.addProduct(produkt2)
    Database.printProducts()
}