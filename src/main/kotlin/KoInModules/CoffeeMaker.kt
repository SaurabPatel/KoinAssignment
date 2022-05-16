package KoInModules
//package com.BeverageMaker.*

import CoffeeMaker
import ElectricHeater
import Heater
import Pump
import Thermosiphon
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.dsl.module

val coffeeMakerModule = module {

    single { CoffeeMaker(get(), get()) }
    single<Pump> { Thermosiphon(get()) }
    single<Heater> { ElectricHeater() }

}

class Main : KoinComponent {
    val coffeeMaker: CoffeeMaker by inject()
}
