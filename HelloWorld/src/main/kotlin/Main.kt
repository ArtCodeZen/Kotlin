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
}