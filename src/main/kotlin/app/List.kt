package app

/**
 * List
 *
 * Tipe datanya unik dan harus berurut
 */

fun main() {
    val list: List<String> = listOf<String>("Cornelius", "Linux")

    println(list[0])
    println(list[1])
    println(list.indexOf("Cornelius"))
    println(list.indexOf("asd"))
    println(list.contains("Linux"))
    println(list.isEmpty())

    val list1: MutableList<String> = mutableListOf()

    list1.add("Cornelius")
    list1.add("Linux")
    println(list1)
    list1[0] = "Comel"
    list1.removeAt(1)
    println(list1)
    list1.add("Linux")
    list1.add("Linux")

    for (value in list1) {
        print("$value ")
    }

    println()

    list1.removeAll(list1)
    println(list1)
}