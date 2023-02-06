fun addTwoNumbers(a : Int, b: Int) : Int{
    return a + b
}
fun largestNumber(a : Int, b: Int): Int{
    fun largest(a: Int, b: Int): Int{
        if(a > b)
            return a
        else
            return b
    }
    return largest(a, b)
}
// for each usado para percorrer listas
fun printLessThanTwo(){
    val list = listOf(1,2,3,4)
    list.forEach(fun(x){
        if(x <=2)println(x)
        else return
    })
    println("This line will still execute")
}
// label explicito
fun printUntilStop(){
    val list = listOf("a", "b", "stop", "c", "s", "maria")
    list.forEach stop@{
        if(it == "stop") return@stop
        else println(it)
    }

}
// label implicito
fun printUntilStopWithoutLabel(){
    val list = listOf("a", "b", "stop", "ll")
    list.forEach{
        if(it == "stop") return@forEach
        else
            println(it)
    }
}
fun main() {
    println("Hello World!")
    println("Soma de dois numeros: ${addTwoNumbers(1,10)}")
    println("Numero maior: ${largestNumber(20,10)}")
    println("printLessThanTwo: ${printLessThanTwo()}")
    println("Label Stop: ${printUntilStop()}")
    println("Without Label Stop: ${printUntilStopWithoutLabel()}")
}