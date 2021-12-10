package app

/**
 * Custom Order
 *
 * Membuat comparable sendiri untuk
 * mengurutkan data yang kita buat
 * sendiri
 */

data class Fruit(val name: String, val quantity: Int)

fun main() {
    val fruits = listOf(
        Fruit("Banana",5),
        Fruit("Grape",2),
        Fruit("Nut",6)
    )

    println("""
        ${fruits.sortedBy { it.name }}
        ${fruits.sortedBy { it.quantity }}
        
        ${fruits.sortedByDescending { it.name }}
        ${fruits.sortedByDescending { it.quantity }}
        
        ${fruits.sortedWith(Comparator { fruit1, fruit2 -> 
        fruit1.quantity.compareTo(fruit2.quantity) })}
    """.trimIndent())
}