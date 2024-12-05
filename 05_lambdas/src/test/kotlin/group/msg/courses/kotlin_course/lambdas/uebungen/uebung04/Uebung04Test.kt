package group.msg.courses.kotlin_course.lambdas.uebungen.uebung04

import group.msg.courses.kotlin_course.lambdas.tasks.uebungen.uebung04.Uebung04
import group.msg.courses.kotlin_course.lambdas.uebungen.MockData
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Uebung04Test {

    private val mockData = MockData()
    @Test
    fun `getCustomersSortedByNumberOfOrdersDesc sortiert gegebene Liste korrekt`(){
        // given
        val unsortedList = listOf(mockData.customer1, mockData.customer2, mockData.customer3, mockData.customer4)
        // when
        val sortedList = Uebung04().findCustomersSortedByNumberOfDeliveredOrdersDesc(unsortedList)
        // then
        assertEquals(sortedList.size, 4)
        assertEquals(sortedList[0], mockData.customer3)
        assertEquals(sortedList[1], mockData.customer1)
        assertEquals(sortedList[2], mockData.customer2)
        assertEquals(sortedList[3], mockData.customer4)
    }
}