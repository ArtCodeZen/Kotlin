internal class Person {
    fun age(): Int = 22

    fun checkLetter(name : String, prefix : String) : Boolean{
        return name.startsWith(prefix)
    }

}