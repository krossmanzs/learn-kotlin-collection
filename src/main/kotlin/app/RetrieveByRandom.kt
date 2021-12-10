package app

/**
 * Retrieve Single Element by Random
 *
 * Mengambil satu element secara
 * random di dalam collection
 */

fun main() {
    val numbers = (1..100).toList()

    println(numbers.random())
    println(numbers.random())
    println(numbers.random())
    println(numbers.random())
    println(numbers.random())
}