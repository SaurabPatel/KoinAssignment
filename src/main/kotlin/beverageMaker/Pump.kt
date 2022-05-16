interface Pump {
    fun pump()
}

class Thermosiphon(val heater: Heater): Pump {
    override fun pump() {
        if(heater.isHot()) {
            println("Pump Water")
        }
    }
}