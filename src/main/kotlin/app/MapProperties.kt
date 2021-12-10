package app

/**
 * Properties di Map
 *
 * Menyimpan value properties di map.
 * Biasanya dilakukan ketika parsing data
 * JSON dkk, sehingga kita bisa melakukan
 * delegate properties di Map
 */

class Application(map: Map<String, Any>) {
    val name: String by map
    val version: Int by map
}

fun main() {
    val map = mapOf(
//        "salah" to "Belajar Kotlin", error
        "name" to "Belajar Kotlin",
        "version" to 1.0
    )

    val application = Application(map)

    println(application.name)
    println(application.version)
}