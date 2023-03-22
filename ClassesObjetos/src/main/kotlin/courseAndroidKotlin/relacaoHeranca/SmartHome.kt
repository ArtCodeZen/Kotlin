package courseAndroidKotlin.relacaoHeranca

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
){
    //TV
    fun changeTvChannelToNext(){
        smartTvDevice.nextChannel()
    }
    fun turnOnTv(){
        smartTvDevice.turnOn()
    }
    fun turnOffTv(){
        smartTvDevice.turnOff()
    }
    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }
    // LIGHT
    fun turnOnLight(){
        smartLightDevice.turnOn()
    }
    fun turnOffLight(){
        smartLightDevice.turnOff()
    }
    fun increaseLightBrightness(){
        smartLightDevice.increaseBrightness()
    }
    // TURN OFF ALL
    // desligar todos os aparelhos
    fun turnOffAllDevices(){
        turnOffTv()
        turnOffLight()
    }
}