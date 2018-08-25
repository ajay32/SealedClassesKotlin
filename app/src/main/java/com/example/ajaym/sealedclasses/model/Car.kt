package com.example.ajaym.sealedclasses.model

sealed class Car {

    data class Maruti(val speed: Int) : Car()
    data class Bugatti(val speed: Int, val boost: Int) : Car()
    object NotACar : Car()

}