package app

/**
 * Testing (Filtering)
 *
 * Operation yang bisa digunakan untuk mengecek isi data dari collection.
 *
 * Hasilnya adalah boolean, dimana true jika sesuai kondisi, dan false jika tidak sesuai kondisi
 */

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 42, 1, 5, 22, 74, 3, 7, 84)
    println(list1.any { it > 5 }) // satu data lebih dari 5
    println(list1.none { it > 5 }) // true jika tidak ada satupun data yang match
    println(list1.all { it > 0 }) // true jika semua data match
    println(list1.any()) // apakah terdapat data
    println(list1.none()) // apakah tidak ada data
}