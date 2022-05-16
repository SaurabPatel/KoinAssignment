interface Heater {
    fun on()
    fun off()
    fun isHot(): Boolean
}

public class ElectricHeater: Heater {

    var heating: Boolean = false

    override fun on() {
        println("Electric heater started...")
        heating = true
    }

    override fun off() {
        println("Electric heater Stop...")
        heating = false
    }

    override fun isHot(): Boolean {
        return heating
    }

}