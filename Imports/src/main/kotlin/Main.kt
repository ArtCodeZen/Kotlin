
import Classes.PI
import Classes.bar
import Classes.PI as myMath
fun main() {
    println("Hello World!")
    println(bar())
    println(PI)
    val test = myMath
    println(test)

    // usandos cifrão
    val nome = "Amanda"
    println("A pessoa chamada $nome")               // nome
    println("Tamanho do nome: ${nome.length}" )     //tamanho do nome

    // Intervalos
    /**
     * criar um intervalo
     * autocompleta como se fosse no excel
     * */
    val aToz = "a".."z"
    val oneToten = 1 .. 10

    println("A até Z: ${"f" in aToz}")
    
    println("1 até 10: $oneToten")

    val countinDown = 100.downTo(0)
    val rangeTo = 10.rangeTo(20)
    println(countinDown)
    println(rangeTo)

}