package app

/**
 * Fold & Reduce
 *
 * Membuat aggregate secara manual yaitu
 * operasi yang dilakukan pada element-element
 * yang ada di collection secara iterasi
 * sequential dan mengembalikan hasil.
 *
 * Hasil dari fold dan reduce akan digunakan
 * untuk iterasi selanjutnya
 */

fun main() {
    val numbers = (1..10).toList().shuffled()

    val max = numbers.reduce{first, second ->
        println("$first : $second")
        if (first > second) first
        else second
    }
    println(max)

    println()

    val min = numbers.reduce { first, second ->
        println("$first : $second")
        if (first < second) first
        else second
    }
    println(min)

    println()

    val sum = numbers.fold(0){first, second ->
        first + second
    }
    println(sum)

    val names = listOf("Cornelius","Linux")
    val count = names.fold(0){first, second ->
        first + 1
    }
    println(count)
    println(names.count())
}