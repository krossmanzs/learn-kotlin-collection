package app

/**
 * Random Order (Ordering)
 *
 * Mengacak isi element di collection
 */

fun main() {
    val list = (1..10).toList()

    println("""
        ${list.shuffled()}        
        ${list.shuffled()}        
        ${list.shuffled()}        
        ${list.shuffled()}        
        $list        
    """.trimIndent())
}