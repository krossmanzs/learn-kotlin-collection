package app

/**
 * Chunked
 *
 * Operasi untuk memotong collection
 * menjadi beberapa collection
 */

fun main() {
    val numbers = (1..100).toList()

    val list1 = numbers.chunked(10)
    println("""
        ${list1.size}
        $list1
    """.trimIndent())

    val list2 = numbers.chunked(10).map { values ->
        var total = 0
        values.forEach { total += it }
        total
    }
    println(list2)
}