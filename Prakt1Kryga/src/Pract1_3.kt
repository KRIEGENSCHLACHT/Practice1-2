fun main() {
    println("Введите сумму: ")
    val buyAmount = readln().toInt()
    val isRegularBuyer = true
    var discount = 0
    var allAmount = buyAmount

    when {
        buyAmount in 1..1000 -> {
            println("Скидка по данной сумме не предоставляется")
        }
        buyAmount in 1001..10000 -> {
            discount = 100
            allAmount -= discount
        }
        buyAmount > 10000 -> {
            discount = (buyAmount * 0.05).toInt()
            allAmount -= discount
        }
    }
    if (isRegularBuyer) {
        val regBuyerDiscount = (allAmount * 0.01).toInt()
        allAmount -= regBuyerDiscount
    }
    println("Сумма покупки: $buyAmount руб.")
    println("Скидка на музыку: $discount руб.")
    println("Итого к оплате: $allAmount руб.")
}