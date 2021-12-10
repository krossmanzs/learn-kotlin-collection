package app

/**
 * Natural (Ordering)
 *
 * Mengurutkan data yang merupakan
 * turunan dari Comparable
 */

fun main() {
    val numbers = listOf(1,5,2,6,7,1,2,3)

    println("""
        ${numbers.sorted()}
        ${numbers.sortedDescending()}
    """.trimIndent())
}