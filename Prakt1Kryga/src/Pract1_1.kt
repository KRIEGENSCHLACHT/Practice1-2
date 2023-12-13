fun main() {
    println("Введите сумму: ")
    val amount = readln().toInt()
    val baseProcent: Double = 0.75
    val VisaProcent: Double = 0.6
    println("Базовая комиссия за перевод - 0,75%, минимум от 35 рублей")
    if (amount >= 35) {
        val FirstComission: Double = (baseProcent/100) * amount
        val Visa_Mir: Double = FirstComission
        val VK: Double = FirstComission
        if (amount >= 300 && amount < 75000){
            println("Комиссия с $amount рублей по Mastercard и Maestro - $FirstComission")
        }else{
            val MasterCard_Maestro: Double = (VisaProcent/100) * amount
            println("Комиссия с $amount рублей по Mastercard и Maestro - $MasterCard_Maestro")
        }
        println("Комиссия с $amount рублей по Visa и МИР: $Visa_Mir")
        println("Комиссия с $amount рублей по VK Pay: $VK")
    }else{
        println("Сумма не удовлетворяет условиям перевода")
    }
}