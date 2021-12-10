package app

fun main() {
    val numbers = (1..100).toList()

    println("""
        ${numbers.sum()}
        ${numbers.maxOrNull()}
        ${numbers.minOrNull()}
        ${numbers.average()}
        ${numbers.count()}
        
        ${numbers.sumOf { it / 2 }}
        ${numbers.maxByOrNull { it > 20 }}
    """.trimIndent())
}