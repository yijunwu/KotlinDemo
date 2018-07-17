package _03_functions.kt

fun String.getFirstWord(separator: String = " "): String {
    val index = indexOf(separator)
    return if (index < 0) this else substring(0, index)
}

fun main(args: Array<String>) {
    println(
            "Jane Doe".getFirstWord(separator = ",")
    )
}