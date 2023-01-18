fun plusOne(x : Int) = x + 1

fun main() {
    println("Hello World!")
    var x = 10
    x = plusOne(10)
    System.out.println(x.toString())

    // tipos de dados
    var int = 10
    var string = "ola"
    var float = 10.2

    println(int)
    println(string)
    println(float)

    // float to double
    println("Float to double:" + float.toDouble())

    // shift left método binário
    var shift = 1 shl 1
    println("Shift valor 1: " + shift)

    var flg = 1 and 0x11
    println("flag: " + flg)

    // invert
    val inv = 1.inv()
    println(inv)

    // if compare - comparar se é verdadeiro ou falso!
    var i = 10;
    var j = 20;
    println("valor de i: " + i + " valor de j: " + j)
    println("i < j: " + (i < j).toString())
    println("i > j: " + (i > j).toString())
    println("i < j && j > i: " + (i < j && j > i).toString())

    // chars
    println("Meu texto exemplo\nsalto de linha")

    // arrays
    val array  = arrayOf("banana", "maçã", "ervilha")
    println(array[0])

    val perfectSquares = Array(3, {k->k * 10})
    println(perfectSquares[2])

    // comentários
    /*comentário extenso
    *
    * teste
    * teste
    * */
}