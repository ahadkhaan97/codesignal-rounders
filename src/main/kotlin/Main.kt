import java.lang.Exception

fun main() {
    print(solution(99))
}

fun solution(n: Int): Int {
    val numberString = n.toString().toCharArray()
    for (i in numberString.size - 1 downTo 1) {
        if (numberString[i].digitToInt() < 5) {
            numberString[i] = '0'
        } else {
            numberString[i] = '0'
            val toBeAdded = ((numberString[i - 1].digitToInt() + 1))
            if (toBeAdded < 10) {
                numberString[i - 1] = ((numberString[i - 1].digitToInt() + 1).digitToChar())
            } else {
                numberString[i - 1] = '0'
                try {
                    numberString[i - 2] = '1'
                } catch (e: Exception) {
                    return ('1' + String(numberString)).toInt()
                }
            }
        }
    }

    return String(numberString).toInt()
}