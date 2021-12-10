package app

/**
 * Association (Transformations)
 *
 * Operasi transformasi dari collection menjadi map.
 * Elemen hasil bisa menjadi key atau value
 */

fun main() {
    val list: List<String> = listOf("Cornelius", "Linux")

    val map1: Map<String, Int> = list.associate { Pair(it, it.length) }
    println(map1)

    val map2: Map<String, Int> = list.associateWith { it.length }
    println(map2)

    val map3: Map<Int, String> = list.associateBy { it.length }
    println(map3)
}