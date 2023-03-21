package LivroKotlin.Heranca

class CheckPayment(amount: Float, name: String, bankId: String) : Payment(amount) {
    // atributos privados
    private val name: String = name
    private val bankId: String = bankId
    private val amount: Float = amount
    fun getName() : String = this.name
    fun getBankId() : String = this.bankId

    fun getAmount() : Float = amount
}