fun main() {

    val doceDeBanana: (Int) -> String = { quantidade ->
        "x$quantidade de doce de banana expressao indireta"
    }
    val myFun = ::printMessage
    myFun()

    val myAlert = printMessageAlert
    myAlert()
    happyMessage()
    val functionAltoBaixo = altoOuBaixo(true, doceDeBanana)
    val functionAltoBaixoFinal = altoOuBaixo(true, {"x$it de doce de babana expressao direta"})
    val functionAltoBaixoResumida = altoOuBaixo(true) { "x$it de doce de babana expressao final" }
    // usando o repeat
    repeat(times = 3){
        functionAltoBaixo()
    }
    functionAltoBaixoResumida()
    functionAltoBaixoFinal()
    lambdaTest(dado = {"Valor: $it"})



}
fun printMessage(){
    println("OK!")
}
val printMessageAlert ={
    println("Alert OK!")
}
// Unit significa não retorna nada!
val happyMessage: ()->Unit = {
    println("Unidade vazia, legal")
}
fun lambdaTest(dado: (Int) -> String){
    println(dado(10))
    val mensagem = { println("OK") }

}
fun altoOuBaixo(isAlto: Boolean, outroDoce: (Int) -> String) : ()->Unit{
    if(isAlto){

        println(outroDoce(5))
        return alto
    }
    else{
        return baixo
    }
}

val alto = {
    println("Alto".uppercase())
}
val baixo = {
    println("Baixo".uppercase())
}