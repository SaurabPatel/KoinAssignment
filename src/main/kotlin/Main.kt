package com.KoinMo

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import KoInModules.*


fun main(args: Array<String>) {

    startKoin{
        modules(coffeeMakerModule)
    }

    val main = Main()
    main.coffeeMaker.brew(CoffeeType.Cappuccino)
}