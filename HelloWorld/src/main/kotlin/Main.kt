fun plusOne(x : Int) = x + 1

fun main() {
    println("Hello World!")
    val x : Int = plusOne(10)
    println(x.toString())

    // tipos de dados
    val int = 10
    val string = "ola"
    val float = 10.2

    println(int)
    println(string)
    println(float)

    // float to double
    println("Float to double:$float")

    // shift left método binário
    val shift = 1 shl 1
    println("Shift valor 1: $shift")

    val flg = 1 and 0x11
    println("flag: $flg")

    // invert
    val inv = 1.inv()
    println(inv)

    // if compare - comparar se é verdadeiro ou falso!
    val i = 10
    val j = 20
    println("valor de i: $i valor de j: $j")
    println("i < j: " + (i < j).toString())
    println("i > j: " + (i > j).toString())
    println("i < j && j > i: " + (i < j && j > i).toString())

    // chars
    println("Meu texto exemplo\nsalto de linha")

    // arrays
    val array  = arrayOf("banana", "maçã", "ervilha")
    println(array[0])

    val perfectSquares = Array(3) { k -> k * 10 }
    println(perfectSquares[2])

    // comentários
    /*comentário extenso
    *
    * teste
    * teste
    * */
}