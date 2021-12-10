package app

/**
 * Mapping pada Map
 *
 * bisa digunakan untuk mendapatkan suatu
 * key atau values pada map
 */

fun main() {
    val map: Map<Int, String> = mapOf(
        1 to "Cornelius",
        2 to "Linux"
    )
    val mapKeys = map.mapKeys { it.key * 10 }.also { println(it) }

    val mapValues = map.mapValues { it.value.uppercase() }.also { println(it) }
}