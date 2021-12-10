package app

/**
 * Retrieve Single Elements by Condition
 *
 * Mengambil satu element di
 * collection berdasarkan kondisi
 */

fun main() {
    val numbers = (1..50).toList()

    println(numbers.first { it > 25 })
    println(numbers.last { it < 45 })
//    println(numbers.last { it < 0 }) Error NoSuchElementException
    println(numbers.firstOrNull { it > 50 })
    println(numbers.firstOrNull { it > 49 })
    println(numbers.lastOrNull { it > 50 })
    println(numbers.find { it < 20 })
    println(numbers.findLast { it > 15 })
}