package CourseAndroidKotlin.RelacaoHeranca

class SmartLightDevice(deviceName: String, deviceCategory: String) : SmartDevice(name = deviceName, category = deviceCategory){


    var brightnessLevel by RangeRegulator(1, 1, 100)
    fun increaseBrightness(){
        brightnessLevel++
        println("Brightness increased to $brightnessLevel")
    }
    override fun turnOn(){
        super.turnOn()
    }
    override fun turnOff(){
        super.turnOff()
    }
    override fun showAllStatus() {
        println("Light - Status: $deviceStatus Light-Brithtness: $brightnessLevel")
    }
}