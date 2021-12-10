package app

/**
 * Map
 *
 * Suatu jenis Collection yang berbentuk
 * key-value, dimana key berperan sebagai index
 */

fun main() {
    val map: Map<String,String> = mapOf(
        "a" to "Cornelius",
        "b" to "Linux"
    )

    println(map["a"])
    println(map["b"])

    printMap(map)

    println(map.keys)
    println(map.values)

    val map1: MutableMap<String,String> = mutableMapOf()

    map1.put("1","Cornelius")
    map1["2"] = "Linux"

    printMap(map1)

    map1["2"] = "Linu"

    printMap(map1)

    map1.clear()

    printMap(map1)

    println(map1.getOrDefault("5","data tidak ada"))
}

fun printMap(map: Map<String,String>) {
    if (map.isNotEmpty()) {
        for ((key, value) in map) {
            println("index $key berisi $value")
        }
    } else {
        println("Empty")
    }
}