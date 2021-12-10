package app

/**
 * Checking Existence
 *
 * Untuk mengecek apakah dalam collection
 * terdapat data yang kita cari
 */

fun main() {
    val numbers = (1..20).toList()

    println("""
        ${numbers.contains(5)}
        ${numbers.contains(31)}
        ${numbers.containsAll(listOf(5,2,1))}
        ${numbers.isEmpty()}
        ${numbers.isNotEmpty()}
    """.trimIndent())
}