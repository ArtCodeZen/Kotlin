import kotlin.math.abs

// when ser argumento! não tem argumento when(vazio)
fun whenWhithouArgs(x: Int, y :Int) : Boolean{
    when {
        x < y -> return true
        x > y -> return false
        else -> return false
    }
}
fun isSingleDigit(x : Int) : Boolean{
    return when(x){
        in -9..9 -> true
        else -> false
    }
}

fun isDieNumber(x : Int) : Boolean{
    return when(x){
        in listOf(1,2,3,4) -> true
        else -> false
    }
}
fun mathAbs(x : Int): Boolean{
    return when(x){
        abs(x) -> true
        else -> false
    }
}

// casting inteligente
fun startWithFoo(any: Any) : Boolean{
    return when(any){
        is String -> any.startsWith("Foo")
        else -> false
    }
}
fun main() {
    println("When")
    val x = whenWhithouArgs(10, 10)
    println(x)
    println("Single Digit: ${isSingleDigit(9)}" )
    println("Die number: ${isDieNumber(5)}" )
    println("Math absolute: ${mathAbs(-10)}")
    println("Start with Foo: ${startWithFoo("sd")}")
}