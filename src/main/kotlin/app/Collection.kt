package app

/**
 * Collection
 *
 * Digunakan sebagai general operation
 * terhadap struktur data collection,
 * seperti membaca dan menulis data di
 * collection
 *
 * Merupakan turunan dari interface Collection
 */

fun <T> displayCollection(collection: Collection<T>) {
    for (value in collection) {
        print("$value ")
    }
    println()
}

fun <T> displatMutableCollection(collection: MutableCollection<T>) {
    for (value in collection) print("$value ")
    println()
}

fun main() {
    displayCollection(listOf("Cornelius", "Linux"))
    displayCollection(setOf("Cornelius", "Linux"))
    displayCollection(mutableSetOf("Cornelius", "Linux"))
    displayCollection(mapOf("Cornelius" to "Linux").entries) // entries membalikkan set
//    displayCollection(mapOf("Cornelius" to "Linux")) // Erorr, Map bukan turunan Collection

    println()

    // mutable collection
    displatMutableCollection(mutableListOf("Cornelius", "Linux"))
    displatMutableCollection(mutableSetOf("Cornelius", "Linux"))
    displatMutableCollection(mutableMapOf("Cornelius" to "Linux").entries)
}