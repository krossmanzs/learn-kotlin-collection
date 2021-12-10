package app

/**
 * Iterator
 *
 * memiliki child interface, yaiitu ListIterator
 * dan MutableListIterator
 *
 * Set tetap menggunakan Iterator
 *
 * Sedangkan Map tidak mendukung Iterator
 */

fun <T> displayListIterator(listIterator: ListIterator<T>) {
    println("Display Next")
    while (listIterator.hasNext()) { // maju sampe ujung index
        println(listIterator.next())
    }

    println()
    println("Display Previous")
    while (listIterator.hasPrevious()) { // balik ke awal index
        println(listIterator.previous())
    }
}

fun <T> displayMutableListIterator(mutableListIterator: MutableListIterator<T>) {
    while (mutableListIterator.hasNext()) {
        println(mutableListIterator.next())
    }
}

fun removeOddNumber(mutableListIterator: MutableListIterator<Int>) {
    while (mutableListIterator.hasNext()) {
        val value = mutableListIterator.next()
        if (value % 2 == 1) mutableListIterator.remove()
    }
}

fun main() {
    displayListIterator(listOf("Cornelius", "Linux", "Anjay").listIterator())

    println()
    println("Mutable List Iterator")
    val mutableList = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    removeOddNumber(mutableList.listIterator())
    displayMutableListIterator(mutableList.listIterator())
}
