package courseAndroidKotlin.relacaoHeranca

open class SmartDevice(val name: String, val category: String){
    var deviceStatus = "on"
    open val deviceType = "unknown"
    open fun turnOn(){
        deviceStatus = "online"
    }
    open fun turnOff(){
        deviceStatus = "offline"
    }
    open fun showAllStatus(){}
}

// observação todas as classes do kotlin são final - impossibilitando de herdar
// por isso se queremos deixar public temos que por open
// isso também vale para funções