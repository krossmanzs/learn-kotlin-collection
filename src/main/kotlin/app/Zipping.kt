package app

/**
 * Zipping (Transformations
 *
 * transformasi yang digunakan untuk
 * menggabungkan dua buah collection.
 */

fun main() {
    val list1: List<String> = listOf("Cornelius", "Linux")
    val list2: List<String> = listOf("Ganteng", "Bangetssss")

    list1.zip(list2).also { println(it) }

    list1.zip(list2) {value1, value2 ->
        "$value1 $value2"
    }.also { println(it) }
}