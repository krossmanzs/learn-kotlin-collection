package app

/**
 * Collection Operations
 *
 * Kotlin menyediakan operations tambahan berupa
 * extension function yang selalu menghasilkan
 * collection baru, tanpa mengubah data di collection
 * aslinya.
 *
 * Jadi Collection Operations di kotlin sangat aman
 * ketika dilakukan karena tidak akan merubah collection
 * aslinya
 */

/**
 * Jenis Operations
 *
 * - Transformations, melakukan transformasi terhadap collection.
 * - Filtering, melakukan filtering atau seleksi terhadap collection.
 * - Plus and minus operators, operasi + dan - terhadap collection.
 * - Grouping, melakukan pemisahan dalam group terhadap collection.
 * - Retrieving single elements, mengambil satu data di collection.
 * - Ordering, melakukan pengurutan data di collection.
 * - Aggregate operations, melakukan agregasi terhadap data yang ada di Collection.
 */

fun main() {
    val list = listOf("Cornelius","Linux")
    list.forEach { println(it) }

    list.forEachIndexed {index: Int, s: String ->
        println("$index : $s")
    }
}