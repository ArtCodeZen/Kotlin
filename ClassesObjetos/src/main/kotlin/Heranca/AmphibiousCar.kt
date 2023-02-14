package Heranca

class AmphibiousCar(val name: String) : Drivable, Sailable {
    override fun Drive() {
        println("Driving - Dirigindo")
    }

    override fun Sailable() {
        println("Sailable")
    }
}