/*
* Criação de um singleton
* Diferente do java no kotlin criamos um object
* e dentro desse object possui a classe que vira o
* singleton
* */
open class SingletonParent(var x: Int){
    fun something():Unit{
        println("X=$x")
    }

}
object SingletonDerive:SingletonParent(10){}