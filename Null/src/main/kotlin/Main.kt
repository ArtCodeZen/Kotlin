fun main() {
    // usar o ? depois do tipo para mostrar que podemos por algo nulo na variável!
    var name : String? = "Sandra"
    println(name)
    name = null
    println(name)
    name = "Jairo"
    // println(name.length) mostra uma mensagem de erro pois estamos trabalhando com algo que pode ser nulo
    // sendo assim para ver o tamanho do length temos que por o ?
    println(name?.length)
}