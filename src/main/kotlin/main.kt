fun main() {
    val amount = 1000.0 // сумма перевода в рублях
    val commission = if (amount * 0.0075 >= 35) amount * 0.0075 else 35.0 // расчет комиссии в рублях
    val totalAmount = amount + commission // итоговая сумма с учетом комиссии
    println("Сумма перевода: $amount руб.")
    println("Комиссия: $commission руб.")
    println("Итоговая сумма: $totalAmount руб.")
}
