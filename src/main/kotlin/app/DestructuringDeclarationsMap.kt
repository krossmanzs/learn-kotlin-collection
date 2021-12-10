package app

/**
 * Destructuring Declarations di Map
 *
 * Map menyimpan datanya dalam Entry<K,V>, dimana
 * Entry memiliki function component1() untuk mendapatkan
 * key dan component2() untuk mendapatkan value. Kedua
 * function tersebut bisa kita lakukan destructuring di
 * Entry Map
 */

fun main() {
    val map = mapOf(
        "a" to "Cornelius",
        "b" to "Linux"
    )

    for ((key, value) in map) {
        println("$key : $value")
    }

    map.forEach { key, value -> println("$key : $value") }
    map.forEach { entry -> println("${entry.component1()} : ${entry.component2()}") }
}