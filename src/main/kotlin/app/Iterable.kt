package app

/**
 * Iterable
 *
 * General operation untuk melakukan iterasi
 * seluruh data di collection, atau menghapus
 * data di collection.
 *
 * Merupakan superclass dari Collection interface.
 */

fun <T> displayIterable(iterable: Iterable<T>) {
//    for(value in iterable) {
//        println(value)
//    }

//kode diatas adalah versi singkat dari:
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}

fun main() {
    displayIterable(listOf("Cornelius", "Linux"))
    displayIterable(setOf("Cornelius", "Linux"))
}