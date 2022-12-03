package day2

import kotlin.test.Test
import kotlin.test.*

class RoundTest {
  @Test fun forcesDraw() {
    val round = Round("A", "Y")

    assertEquals(round.winScore(), 3)
  }

  @Test fun forcesLoss() {
    val round = Round("B", "X")

    assertEquals(round.winScore(), 0)
  }

  @Test fun forcesWin() {
    val round = Round("C", "Z")

    assertEquals(round.winScore(), 6)
  }

  @Test fun addsShapeScore() {
    val round = Round("C", "Z")

    assertEquals(round.shapeScore(), 1)
    assertEquals(round.score(), 7)
  }
}