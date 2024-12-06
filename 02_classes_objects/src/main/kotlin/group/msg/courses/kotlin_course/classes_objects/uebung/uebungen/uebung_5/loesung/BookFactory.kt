package group.msg.courses.kotlin_course.classes_objects.uebung.uebungen.uebung_5.loesung

object BookFactory {
    fun createBook(title: String, author: String, year: Int): Book {
        return Book(title, author, year)
    }
}