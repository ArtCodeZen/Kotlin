fun main() {
    println("Hello World!")
    val cor = "r"
    when(cor){
        "verde"->println("cor verde")
        "vermelho", "red"->{
            println("vermelho")
            println("red")
        }
        in "a".."z"-> println("a..z")
        else->println("invalid!")
    }
}