package app

/**
 * Retrieve Single Elements by Position
 *
 * Mengambil satu element di collection menggunakan posisi
 */

fun main() {
    val set = setOf("Cornelius", "Linux")

    println(set.elementAt(0))
    println(set.last())
    println(set.first())
    println(set.elementAtOrNull(3))
    println(set.elementAtOrElse(3) {"tidak ada"})
    println(set.elementAtOrElse(1) {"tidak ada"})
}