package group.msg.courses.kotlin_course.nullability.uebung.uebung_2.loesung

data class Address(val postalCode: String?)
data class Person(val address: Address?)

class SimplifyMe {
    fun simplifyMeOptimized(person: Person?): String {
        return person?.address?.postalCode ?: "No postal code available"
    }
}
