package app

/**
 * Sequence
 *
 * Sama dengan collection lain, bedanya
 * squence mengeksekusi semua operasi secara
 * lazy. Hanya akan dieksekusi ketika dibutuhkan
 *
 * Kapan digunakan?
 * - Saat data collection besar
 * - Operasi collection kompleks dan banyak
 * - Device mempunyai RAM yang memadai
 *
 * Jangan gunakan ketika:
 * - Data collection tidak terlalu besar, karena ada overhead lazy object di sequence
 * - Operasi yang dilakukan sederhana
 */

fun main() {
    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    val result = words
        .filter {
            println("filter $it")
            it.length > 3
        }
        .map {
            println("map $it")
            it.uppercase()
        }
        .take(4)

    println(result)

    println("===========")

//    val sequence = sequenceOf("Cornelius","Linux")
    val sequence = words.asSequence()

    val resultSequence = sequence
        .filter {
            println("filter $it")
            it.length > 3
        }
        .map {
            println("map $it")
            it.uppercase()
        }
        .take(4)

    println(resultSequence.toList())
}