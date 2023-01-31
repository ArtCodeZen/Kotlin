// when ser argumento! não tem argumento when(vazio)
fun whenWhithouArgs(x: Int, y :Int) : Boolean{
    when {
        x < y -> return true
        x > y -> return false
        else -> return false
    }
}

fun main() {
    println("When")
    val x = whenWhithouArgs(10, 10)
    println(x)
}