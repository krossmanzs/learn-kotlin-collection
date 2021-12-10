package app

/**
 * Konversi Collection
 *
 * Kita bisa melakukan konversi collection ke jenis collection lain secara mudah
 *
 * Misal dari array ke list, atau dari range ke set, atau dari set ke list, bisa dilakukan dengan mudah
 *
 * Caranya dengan menambah kata "to" didepan
 */

fun main() {
    val array = arrayOf(1,2,0,9,10)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()

    val mutableSet = range.toMutableSet()
    val mutableList = range.toMutableList()

    val listToMutableList = list.toMutableList()
    val setToMutableSet = set.toMutableSet()

    val sortedSet = array.toSortedSet()
}