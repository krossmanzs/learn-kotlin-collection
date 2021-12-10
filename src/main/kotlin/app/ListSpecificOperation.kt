package app

/**
 * List Specific Operation
 *
 * Operasi khusus dibuat untuk list
 */

fun main() {
    val list = listOf("Cornelius","Linux")

    println(list.getOrNull(1))
    println(list.getOrNull(5))
    println(list.getOrElse(2) {index -> "Tidak ada" })
    println(list.getOrElse(1) {index -> "Tidak ada" })

    println(list.subList(0,2))

    val numbers = (1..100).toList()
    println(numbers.binarySearch(70))

    println(numbers.indexOf(2))
    println(numbers.indexOfFirst { it > 3 })
    println(numbers.indexOfLast { it > 4 })
}