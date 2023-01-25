fun main() {
    println("Hello World!")
    val person = Person()
    println(person.age())
    println("Status: ${person.checkLetter("amanda", "a")}")
    println("BoolTest: ${person.boolTest("amanda")}")
    println(person.tryException())
}