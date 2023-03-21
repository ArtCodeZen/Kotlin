package CourseAndroidKotlin.RelacaoHeranca

class SmartLightDevice(deviceName: String, deviceCategory: String) : SmartDevice(name = deviceName, category = deviceCategory){


    var brightnessLevel = 0
        set(value){
            if(value in 0..100){
                field = value
            }
        }
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