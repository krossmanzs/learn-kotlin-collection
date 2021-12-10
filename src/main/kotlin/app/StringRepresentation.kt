package app

/**
 * String Representation (Transformations)
 *
 * Operasi transofrmasi untuk mengubah collection menjadi String
 */

fun main() {
    val list: List<String> = listOf("Cornelius","Linux")

    val string1: String = list.joinToString(" ", "|","|")
    println(string1)

    val string2: String = list.joinToString(" ","|","|") {it.uppercase()}
    println(string2)

    val builder = StringBuilder()
    list.joinTo(builder," ", "|", "|")
    list.joinTo(builder," ", ">", "<")
    list.joinTo(builder," ", "@", "@")
    val string3 = builder.toString()
    println(string3)

    val numbers: List<Int> = (1..10).toList()
    numbers.joinToString(" ").also { println(it) }
}