package app

/**
 * Unzip
 *
 * Untuk memecah Pair
 */

fun main() {
    val list: List<Pair<String, String>> = listOf(
        "a" to "Cornelius",
        "b" to "Linux"
    )

    list.unzip().also { println("""
        ${it.first}
        ${it.second}
    """.trimIndent()) }
}