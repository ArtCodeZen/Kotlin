import java.awt.event.MouseAdapter

class ClasseDentroDeClasse(classeNome: String) {
    private val name: String
    init{
        name = classeNome
    }
    inner class InnerLine(val x : Int, val y: Int){
        fun draw(): Unit{
            println("Hello classe interna $x - ${y}")
        }
    }
    fun draw(): Unit{
        println("Classe normal")
    }

}

class SomeField(){
    private val somefield: Int = 1
    inner class B{
        private val somefield: Int = 2
        fun foo(){
            println("somefield Class B : " + this.somefield)
            println("somefield Class SomeField: " + this@SomeField.somefield )
        }
    }
}

