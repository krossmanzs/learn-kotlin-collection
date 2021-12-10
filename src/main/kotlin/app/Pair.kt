package app

/**
 * Pair
 *
 * Persatuan dua data yang berpasangan
 */

fun main() {
    val pair1 = Pair("Cornelius","Linux")

    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String,String> = "Cornelius" to "Linux"
    println(pair2.first)
    println(pair2.second)
}