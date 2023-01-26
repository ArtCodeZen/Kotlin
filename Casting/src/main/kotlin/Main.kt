fun isString(any: Any) : Boolean{
    return if(any == Int) true else false
}
fun selectItem(name: String): String{
    return when(name){
        "go" -> "Hello"
        "exit" -> "sair"
        else-> "não existe na lista"

    }

}
fun main() {
    println("Casting")
    println(isString(String))
    println(selectItem("gss"))
}