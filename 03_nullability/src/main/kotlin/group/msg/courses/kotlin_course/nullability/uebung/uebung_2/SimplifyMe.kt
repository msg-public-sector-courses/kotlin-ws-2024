package group.msg.courses.kotlin_course.nullability.uebung.uebung_2

data class Address(val postalCode: String?)
data class Person(val address: Address?)

class SimplifyMe {

    fun simplifyMe(person: Person?): String {
        if (person != null) {
            val address = person.address
            if (address != null) {
                val postalCode = address.postalCode
                if (postalCode != null) {
                    return postalCode
                }
            }
        }
        return "No postal code available"
    }


    fun simplifyMeOptimized(person: Person?): String {
        TODO("Implementiere die Funktion hier")
    }
}
