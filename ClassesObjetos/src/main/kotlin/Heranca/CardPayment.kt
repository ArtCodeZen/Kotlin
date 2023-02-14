package Heranca

import java.math.BigDecimal
import java.util.*

class CardPayment(amount: Float, val number: String, val expiryDate: Date, val type: CardType) : Payment(amount)