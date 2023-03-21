package LivroKotlin.Heranca

import java.math.BigDecimal

// para liberar esta classe para instanciar precisamos
// colocar como open - ao contrario do java é tudo fechado no kotlin
// no java a palavra reservada é final class para impedir a herança!
open class Payment(amount: Float)