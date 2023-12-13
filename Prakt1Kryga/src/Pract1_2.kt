fun main() {
    println("Введите количество людей: ")
    val likes = readln().toInt()
    val message = when {
        likes % 10 == 1 && likes % 100 != 11 -> "Понравилось $likes человеку"
        likes % 10 in 2..4 && likes % 100 !in 12..14 -> "Понравилось $likes людям"
        else -> "Понравилось $likes людям"
    }

    println(message)
}