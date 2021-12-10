package app

/**
 * Flattening (Transformations)
 *
 * Operasi transformasi untuk menjadikan
 * nested collection menjadi flat
 */

data class Member(val name: String, val hobbies: List<String>)

fun main() {
    val list: List<List<String>> = listOf(
        listOf("Cornelius", "Linux"),
        listOf("Cornelius", "Linux"),
        listOf("Cornelius", "Linux"),
        listOf("Cornelius", "Linux"),
    )

    val listString: List<String> = list.flatten()
    println(listString)

    val members: List<Member> = listOf(
        Member("Linux", listOf("Coding","Gaming")),
        Member("Ekwin", listOf("Traveling","Gaming")),
        Member("Titot", listOf("Sleeping","Gaming"))
    )

//    val hobies = members.map { it.hobbies }.flatten()
    val hobies = members.flatMap { it.hobbies }
    println(hobies)
}