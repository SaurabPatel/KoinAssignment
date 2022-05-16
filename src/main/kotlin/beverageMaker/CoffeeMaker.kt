enum class CoffeeType {
    Black, Latte, Cappuccino
}

class CoffeeMaker(val pump: Pump, val heater: Heater) {

    fun brew(coffeeType: CoffeeType) {
        heater.on()
        pump.pump()
        println("${coffeeType.name} Coffee is Ready! Enjoy")
        heater.off()
    }

}







