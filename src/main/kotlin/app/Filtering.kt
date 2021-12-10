package app

/**
 * Filtering by Predicate
 *
 * Filtering bisa menggunakan predicate berupa
 * lambda yang berisi kondisi filternya.
 *
 * Jika return dari predicate tersebut true,
 * maka data di terima, jika false maka data dibuang
 */

fun main() {
    val list1 = listOf("Cornelius","Linux")
    list1.filter { it.length > 5 }.also { println(it) }
    val list2 = list1.filterIndexed{index, value ->  index % 2 == 0}
    println(list2)

    val list4 = listOf(null,1,"Cornelius",null,5,1,"Linux")
    list4.filterIsInstance<String>().also { println(it) }
    list4.filterNotNull().also { println(it) }
}