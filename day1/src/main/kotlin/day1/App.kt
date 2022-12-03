/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package day1

import java.io.File
import kotlin.collections.*

class App {

    fun call(): String {
        val data = load()
        val elves = parse(data)
        elves.sortByDescending { it.calories }

        return elves.take(3).sumBy { it.calories }.toString()
    }

    fun load(): String {
        return File("src/main/resources/input.txt").readText()
    }

    fun parse(data: String): ArrayList<Elf> {
        val arr: ArrayList<Elf> = ArrayList<Elf>()

        val lines = data.lines().map { it.trim() }
        var currentCalories = 0
        for (line in lines) {
            if (line.isNullOrBlank()) {
                if (currentCalories > 0) {
                    arr.add(Elf(arr.size + 1, currentCalories))
                    currentCalories = 0
                }
            } else {
                currentCalories += line.toInt()
            }
        }

        return arr
    }
}

fun main() {
    println("Sum calories: " + App().call())
}
