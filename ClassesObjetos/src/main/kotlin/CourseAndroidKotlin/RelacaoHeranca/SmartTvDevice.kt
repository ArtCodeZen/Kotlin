package CourseAndroidKotlin.RelacaoHeranca

import CourseAndroidKotlin.RelacaoHeranca.SmartDevice
import LivroKotlin.smartDevice

class SmartTvDevice(deviceName: String, deviceCategory: String) : SmartDevice(name = deviceName, category = deviceCategory){
    override val deviceType = "Smart_TV"

    var speakerVolume = 2
        set(value){
            if(value in 0..100){
                field = value
            }
        }
    var channelNumber = 1
        set(value) {
            if(value in 0..200){
                field = value
            }
        }
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