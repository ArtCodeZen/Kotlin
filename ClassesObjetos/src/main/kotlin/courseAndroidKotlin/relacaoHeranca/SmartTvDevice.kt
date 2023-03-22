package courseAndroidKotlin.relacaoHeranca

class SmartTvDevice(deviceName: String, deviceCategory: String) : SmartDevice(name = deviceName, category = deviceCategory){
    override val deviceType = "Smart_TV"
    // usando o delegate
    // delegando o get e set para uma interface
    var speakerVolume by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)
    var channelNumber by RangeRegulator(1, 0, 200)

    fun increaseSpeakerVolume(){
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }
    fun nextChannel(){
        channelNumber++
        println("Channel number increase to $channelNumber")
    }
    override fun turnOn(){
        deviceStatus = "On"
    }
    override fun turnOff(){
        deviceStatus = "Off"
    }

    override fun showAllStatus() {
        println("$deviceType Status: $deviceStatus Tv-volume: $speakerVolume Tv-channel: $channelNumber ")
    }
}