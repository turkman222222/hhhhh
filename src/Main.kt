fun compressString(input: String): String {
    if (input.isEmpty()) return ""

    val result = StringBuilder()
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == input[i - 1]) {
            count++
        } else {
            result.append(input[i - 1])
            if (count > 1) {
                result.append(count)
            }
            count = 1 }
    }


    result.append(input[input.length - 1])
    if (count > 1) {
        result.append(count)
    }

    return result.toString()
}

fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""
    val compressed = compressString(input)
    println("Сжатая строка: $compressed")
}
