import Heranca.AmphibiousCar
import Heranca.CheckPayment
import Interface.MyDocument

fun main(){
    val device = smartDevice("Henrique", "TV", 1)
    val person = Person("Henrique", "Watanabe", 26)
    val person2 = Person2("Henrique", "Watanabe", null)
    val classeDentroDeClasse = ClasseDentroDeClasse("Minha classe")
    val someF = SomeField()
    try {
        Person("","oo", 26)
    }catch (e: Exception){
        println(e.message)
    }
    println("Nome do meu device: ${device.name}" )
    println("Person nome: ${person.firstName} ${person.lastName} Idade: ${person.age}" )
    println("Person nome: ${person2.getName()} - Idade: ${person2.getAge()}")
    classeDentroDeClasse.InnerLine(10,20).draw()
    someF.B().foo()

    // enums
    //get all - mostragem com for each
    Plants.values().forEach {
        println(it)
    }
    //get especific
    println("Nome: " + Plants.valueOf("MANDIOCA") + " Dias: " + Plants.valueOf("MANDIOCA").days + "Size: " + Plants.valueOf("MANDIOCA").size)
    Word.HELLO.print()
    Word.HELP.print()

    // Singleton
    SingletonDerive.something()
    println(Student.create("Henrique").name)

    val myDocument = MyDocument()

    println(myDocument.name)

    // check payment
    val checkPay = CheckPayment(22f, "James", "nn22")
    println(checkPay.getAmount())
    // amphibious car
    val car = AmphibiousCar("tank")
    car.Drive()
    car.Sailable()
}