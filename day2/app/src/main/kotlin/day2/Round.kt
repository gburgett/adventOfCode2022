package day2

data class Round(val oponnent: String, val me: String) {
  fun shapeScore(): Int =
    when (Pair(oponnent, me)) {
      Pair("A", "X") -> 3
      Pair("A", "Y") -> 1
      Pair("A", "Z") -> 2
      Pair("B", "X") -> 1
      Pair("B", "Y") -> 2
      Pair("B", "Z") -> 3
      Pair("C", "X") -> 2
      Pair("C", "Y") -> 3
      Pair("C", "Z") -> 1
    else -> throw Exception("Unknown pair $oponnent, $me")
  }

  fun winScore(): Int =
      when (me) {
        "X" -> 0
        "Y" -> 3
        "Z" -> 6
        else -> throw Exception("Unknown me $me")
      }

  fun score() = winScore() + shapeScore()

}