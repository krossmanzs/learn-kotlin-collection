package app

/**
 * Map Specific Operations
 *
 * Operasi khusus untuk Map
 */

fun main() {
    val map = mapOf(
        "a" to "Cornelius",
        "b" to "Linux"
    )

//    println(map.getValue("Tidak ada")) error NoSuchElementException
    println(map.getValue("a"))
    println(map.getOrElse("Tidak ada") {"gada anjg"})
    println(map.filter { entry -> entry.value.length > 5 })
    println(map.filterKeys { it != "b" })
    println(map.filterValues { it.length > 5 })
}