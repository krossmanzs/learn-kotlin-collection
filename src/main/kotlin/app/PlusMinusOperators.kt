package app

/**
 * Plus & Minus Operators
 *
 * Parameter pertama adalah collection,
 * dan parameter selanjutnya bisa collection
 * atau element, dan akan menghasilkan
 * collection baru
 */

fun main() {
    val list1 = listOf("Cornelius", "Linux")
    val list2 = list1 + "Anjay"
    println(list2)
    val list3 = list1 + listOf("Anjay", "Banget")
    println(list3)
    val list4 = list1 - "Linux"
    println(list4)
    val list5 = list1 - listOf("Cornelius","linux","Gans")
    println(list5)

    val map1 = mapOf("a" to "Linux", "b" to "Cornelius")
    val map2 = map1 + Pair("c","Anjay")
    println(map2)
    val map3 = map1 - "a"
    println(map3)
}