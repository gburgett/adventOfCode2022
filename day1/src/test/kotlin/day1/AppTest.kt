/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package day1

import kotlin.test.*

class AppTest {
    val data =
        """
    1000
    2000
    3000

    4000

    5000
    6000

    7000
    8000
    9000

    10000
    """

    @Test fun `creates elves`() {
        val subject = App()
        val elves = subject.parse(data)

        assertEquals(elves.size, 5)
    }

    @Test fun `assigns calories`() {
        val subject = App()
        val elves = subject.parse(data)

        assertEquals(elves[0].calories, 6000)
        assertEquals(elves[2].calories, 11000)
        assertEquals(elves[4].calories, 10000)
    }
}
