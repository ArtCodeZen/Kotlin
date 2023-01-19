class smartDevice(val name:String, val category:String){
    var deviceStatus = "online"
    constructor(name:String, category: String, statusCode:Int) : this(name, category){
        deviceStatus = when(statusCode){
            1 -> "ON"
            2 -> "OFF"
            else -> "unknown"
        }
        println(deviceStatus)
    }

    private var volume: Int = 10
    fun turn_on(){
        println("Turned on")
    }
    fun turn_off(){
        println("Turned off")
    }
    fun setVolume(value:Int){
        volume = value
    }
    fun getVolume():Int{
        return volume
    }
}
