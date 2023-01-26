fun isString(any: Any) : Boolean{
    return any is Int
}
fun selectItem(name: String): String{
    return when(name){
        "go" -> "Hello"
        "exit" -> "sair"
        else-> "não existe na lista"

    }

}
fun ss(any: Any) {
    if (any is String){
        println("É string: ${any.length}" )
    }else{
        println("Não é string!")
    }
}
fun main() {
    println("Casting")
    println(isString(String))
    println(selectItem("gss"))
    ss(1)
}