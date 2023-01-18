import java.io.File




fun main() {
    println("Hello World!")
    val a = File("teste.txt")
    val b = File("teste.txt")
    val flg = a !== b
    println(flg)
    val foo = Foo("Henrique")
    foo.imprimeAlgo(10)
    val build = Building("Rua santana")
    build.Reception("110000000").printAddress()


}