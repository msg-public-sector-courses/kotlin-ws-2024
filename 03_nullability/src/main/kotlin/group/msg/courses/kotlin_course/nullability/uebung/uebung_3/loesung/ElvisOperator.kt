package group.msg.courses.kotlin_course.nullability.uebung.uebung_3.loesung

import kotlin.random.Random

fun maybeGreet(): String? {
    return if (Random.nextFloat() < 0.5) {
        "Hello from Kotlin!"
    } else {
        null // not in the mood for greeting right now
    }
}

fun elvisOperatorTask() {
    println(maybeGreet() ?: "Kotlin mag heute nicht")
}

fun main() {
    elvisOperatorTask()
}