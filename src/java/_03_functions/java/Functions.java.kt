package _03_functions.java

class StringUtil {
    fun getFirstWord(s: String, separator: String): String {
        val index = s.indexOf(separator)
        return if (index < 0) s else s.substring(0, index)
    }

    fun getFirstWord(s: String) = getFirstWord(s, " ")
}

fun main(args: Array<String>) {
    println(StringUtil().getFirstWord("Jane Doe"))
}