fun main(){
    var device = smartDevice("Henrique", "TV", 1)
    var person = Person("Henrique", "Watanabe", 26)
    var person2 = Person2("Henrique", "Watanabe", null)
    try {
        Person("","oo", 26)
    }catch (e: Exception){
        println(e.message)
    }
    println("Nome do meu device: ${device.name}" )
    println("Person nome: ${person.firstName} ${person.lastName} Idade: ${person.age}" )
    println("Person nome: ${person2.getName()} - Idade: ${person2.getAge()}")
}