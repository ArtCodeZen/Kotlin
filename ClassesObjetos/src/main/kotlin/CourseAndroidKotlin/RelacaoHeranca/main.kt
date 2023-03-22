package CourseAndroidKotlin.RelacaoHeranca

import CourseAndroidKotlin.RelacaoHeranca.SmartDevice

fun main(){
    val objSmartDevice = SmartTvDevice("Lg ultra wide", "TV")
    objSmartDevice.increaseSpeakerVolume()
    objSmartDevice.nextChannel()
    println(objSmartDevice.speakerVolume)

    val objSmartLightDevice = SmartLightDevice("LED-Light", "Light")
    objSmartLightDevice.brightnessLevel = 20
    objSmartLightDevice.increaseBrightness()

    var smartDevice: SmartDevice = SmartTvDevice("Android-TV", "Entretenimento")
    smartDevice.turnOn()
    smartDevice.turnOff()
    smartDevice.showAllStatus()
    smartDevice = SmartLightDevice("LED-80Watts", "Iluminação")
    smartDevice.turnOn()
    smartDevice.showAllStatus()




}