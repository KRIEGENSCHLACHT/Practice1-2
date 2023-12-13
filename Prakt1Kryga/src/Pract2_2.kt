fun main (){
    println(cardTransaction())
}
fun  cardTransaction()
{
    val MasterProcent: Double = 0.006
    val VisaMIRProcent: Double = 0.0075
    println("Введите тип карты для перевода: ")
    val cardType: String = readln()
    println("Введите сумму перевода: ")
    val amount = readln().toInt()

    when (cardType)
    {
        "Mastercard", "Maestro" -> if (amount <= 75000)
        {
            val allSum = amount
            println("Сумма перевода составит: $allSum рублей. \nКомиссия не взымается.")
        }
        else
        {
            val allSum = amount + (amount * MasterProcent + 20)
            println("Сумма перевода с учётом комиссии составит: $allSum рублей")
        }

        "Visa", "MIR" -> if (amount >= 35)
        {
            val allSum = amount + (amount * VisaMIRProcent)
            println("Сумма перевода с учётом комиссии составит: $allSum рублей")
        }
        else
        {
        println("Переводы по картам MIR и Visa осуществляются от минимальной суммы в 35 рублей.")
        }

        "VKPay" -> if (amount > 0)
        {
            val allSum = amount
            println("Сумма перевода составит: $allSum рублей. \nКомиссия не взымается.")
        }
    }
}