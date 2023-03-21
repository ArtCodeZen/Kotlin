package CourseAndroidKotlin.Construtor

fun main(){
    val smartDevice = SmartDevice("Tv", "Eletronicos", 10)
    smartDevice.turnOn()
    println(smartDevice.deviceStatus)

}

