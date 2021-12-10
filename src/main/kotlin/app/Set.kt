package app

import data.Person

/**
 * Set
 *
 * Tipe datanya unik dan tidak harus berurut
 *
 * akan mengignore data yang duplikat
 *
 * menggunakan hashCode() dan equals untuk membandingkan
 * apakah sebuah object sama atau tidak, jika keduanya sama
 * maka dianggap data tersebut duplicate dan tidak akan
 * diterima di set
 */

fun main() {
    val set: Set<Person> = setOf(
        Person("Cornelius"),
        Person("Linux"),
        Person("Linux")
    )

    println(set.size)
    println(set)

    println()

    val set1: MutableSet<Person> = mutableSetOf()
    set1.addAll(set)

    println(set1)
    set1.add(Person("Titot"))

    for (person in set1) {
        println(person)
    }

    set1.clear()
    println(set1)
}