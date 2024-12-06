package group.msg.courses.kotlin_course.classes_objects.uebung.uebungen.uebung_5.loesung

class Library {

    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun displayBooks() {
        for (book in books) {
            println(book.title)
        }
    }
}