package app

/**
 * Grouping
 *
 * Operasi untuk mengelompokkan
 * element-element pada collection
 */

fun main() {
    val list1 = listOf("a","b","c","a","b","d","d","c","c","aa","bb","cc","aa","dd")
    val map: Map<String,List<String>> = list1.groupBy { it }
    println(map)
    val map2: Map<Int, List<String>> = list1.groupBy { it.length }
    println(map2)

    val grouping: Grouping<String, String> = list1.groupingBy { it }
    println(grouping)
}