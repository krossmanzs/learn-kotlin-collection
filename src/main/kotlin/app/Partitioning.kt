package app

/**
 * Partitioning (Filtering)
 *
 * Membagi collection menjadi dua, dimana
 * collection pertama yang masuk filtering,
 * dan collection kedua yang tidak masuk
 * filtering
 */

fun main() {
    val list1 = listOf(1,2,3,4,5,6,7,8,9,10,12,42,1,5,22,74,3,7,84)

//    val pair: Pair<List<String>,List<String>> = list1.partition { it > 10 }
    val (listMatch, listNotMatch) = list1.partition { it > 10 }
    println("""
        $list1
        $listMatch
        $listNotMatch
    """.trimIndent())
}