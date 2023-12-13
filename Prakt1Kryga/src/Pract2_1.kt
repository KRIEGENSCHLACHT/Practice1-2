fun main() {
    println("Введите значение: ")
    val secondsAgo = readln().toInt()
    val text = agoToText(secondsAgo)
    println(text)
}
fun agoToText(secondsAgo: Int): String {
    return when {
        secondsAgo in 0..60 -> "Был(а) только что"
        secondsAgo in 61..60 * 60 -> minutesAgoToText(secondsAgo / 60)
        secondsAgo in 60 * 60 + 1..24 * 60 * 60 -> hoursAgoToText(secondsAgo / 3600)
        secondsAgo in 24 * 60 * 60 + 1..48 * 60 * 60 -> "Был(а) вчера"
        secondsAgo in 48 * 60 * 60 + 1..72 * 60 * 60 -> "Был(а) позавчера"
        else -> "Был(а) давно"
    }
}
fun minutesAgoToText(minutesAgo: Int): String {
    return when {
        minutesAgo == 1 || minutesAgo % 10 == 1 -> "$minutesAgo минуту назад"
        minutesAgo in 2..4 || minutesAgo in 22..24 || minutesAgo in 32..34 || minutesAgo in 42..44 || minutesAgo in 52..54 -> "$minutesAgo минуты назад"
        else -> "$minutesAgo минут назад"
    }
}
fun hoursAgoToText(hoursAgo: Int): String {
    return when {
        hoursAgo == 1 || hoursAgo % 10 == 1 -> "$hoursAgo час назад"
        hoursAgo in 2..4 || hoursAgo in 22..24 -> "$hoursAgo часа назад"
        else -> "$hoursAgo часов назад"
    }
}