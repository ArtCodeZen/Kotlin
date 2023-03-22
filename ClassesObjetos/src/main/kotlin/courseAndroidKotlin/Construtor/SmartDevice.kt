package courseAndroidKotlin.Construtor

class SmartDevice(val name : String, val category: String){
    var deviceStatus = "online"

    // construtor secundário
    constructor(name: String, category: String, statusCode: Int) : this(name, category){
        deviceStatus = when(statusCode){
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
    fun turnOn(){
        println("SmartDevice is turned on!")
    }
    fun turnOff(){
        println("SmartDevice is turned off!")
    }

}