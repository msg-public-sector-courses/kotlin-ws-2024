package group.msg.courses.kotlin_course.classes_objects.uebung.uebungen.uebung_5.loesung

data class Book(val title: String, val author: String, val year: Int) {
    init {
        require(year > 0)
    }
}