package app

/**
 * Set Specific Operations
 *
 * Operation yang khusus untuk set
 */

fun main() {
    val set1 = (1..10).toSet()
    val set2 = (6..15).toSet()

    println(set1 union set2)
    println(set1 intersect set2)
    println(set1 subtract set2)
    println(set2.subtract(set1))
}