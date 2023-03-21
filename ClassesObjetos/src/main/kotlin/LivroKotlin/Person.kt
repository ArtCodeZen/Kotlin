package LivroKotlin

class Person constructor(val firstName: String, val lastName: String, val age: Int) {
    // require força a inicializar os dados do construtor senão gera uma excessão

    init {
        require(firstName.trim().length > 0) {"Invalid firstName"}
        require(lastName.trim().length > 0){"Invalid lastName"}
        if(age != null){
            require(age > 0 && age < 150) {"Invalid age"}
        }
    }

}