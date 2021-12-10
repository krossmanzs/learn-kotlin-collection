package app

/**
 * Mapping (Transformations)
 *
 * Digunakan untuk mengubah data ke data lain.
 *
 * Mapping membutuhkan lambda function sebagai
 * parameter, dan akan mengembalikan collection
 * hasil result lambda nya
 */

fun main() {
    val list: List<String> = listOf("Cornelius", "Linux")
    val list2: List<String> = list.map { it.uppercase() }.also { println(it) }

    val set1 = setOf("Cornelius","Linux")
    val set2 = set1.map { it.lowercase() }.also { println(it) }

    val names = listOf("Titot","Ekwin","Linux","Jojos","Ruben")
    val namesGanjil = names.mapIndexedNotNull { index, name ->
        if (index %2 == 0) null
        else name
    }.also { println(it) }

    val numbers = (1..100).toList()
    val ganjil = numbers.mapNotNull {
        if (it % 2 == 0) null
        else it
    }.also { println(it) }
}