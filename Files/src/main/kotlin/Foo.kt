
class Foo(name: String) {
    val name = name
    fun imprimeAlgo() = println(name)
    //sobrecarga de método
    fun imprimeAlgo(value: Int){
        println("Resultado do inteiro $value")
    }
}

/*
* usar val address quando o this
* chamar o valor da variável*/
class Building(val address: String){
    inner class Reception(val telephone: String){
        fun printAddress(){
            println(this@Building.address)
            println(this@Reception.telephone)

        }
    }
}