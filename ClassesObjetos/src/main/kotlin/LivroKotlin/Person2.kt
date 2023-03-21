package LivroKotlin

class Person2 constructor(firstName: String, lastName: String, age: Int?) {
    private val name: String
    private val age: Int?
    // modo usando o init, também pode inicializar sem o init
    init {
        this.name = "$firstName, $lastName"
        this.age = age
    }
    fun getName(): String = this.name
    fun getAge(): Int? = this.age



}