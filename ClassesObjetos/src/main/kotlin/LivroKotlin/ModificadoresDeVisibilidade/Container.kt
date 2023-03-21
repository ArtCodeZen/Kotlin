package LivroKotlin.ModificadoresDeVisibilidade

open class Container(val myString : String){
    protected open val fieldA: String = myString
}
class DeriveContainer(myString: String): Container(myString){
    public override val fieldA: String = "Texto trocado override"

}