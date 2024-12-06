package group.msg.courses.kotlin_course.classes_objects.uebung.uebungen.uebung_5.loesung

fun main() {
    val book1 = BookFactory.createBook("Der Steppenwolf", "Hermann Hesse", 1927)
    val book2 = BookFactory.createBook("1984", "George Orwell", 1949)
    val book3 = BookFactory.createBook("Die Verwandlung", "Franz Kafka", 1915)

    val library = Library()
    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)

    library.displayBooks()

}