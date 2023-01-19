class smartDevice {
    val name = "SmartTv"
    val category = "Entertainment"

    var deviceStatus = "online"
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
