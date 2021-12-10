package app

/**
 * Reverse Order (Ordering)
 *
 * Mendapatkan collection dengan
 * urutan data terbalik dari data aslinya
 */

fun main() {
    val list = mutableListOf("Cornelius", "Linux")
    val listReverse = list.reversed()
    val listAsReverse = list.asReversed()

    println("""
        $list
        $listReverse
        $listAsReverse
    """.trimIndent())

    list.add("Anjay")

    println("""
        
        $list
        $listReverse
        $listAsReverse
    """.trimIndent())
}