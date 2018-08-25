package com.example.ajaym.sealedclasses

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ajaym.sealedclasses.model.Car

class MainActivity : AppCompatActivity() {

    val INVALID_SPEED = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //--- its like we have few different objct of same category and they return differnt value ..we could go for this approach
        // in a class we could find height of diffenent students (class is object with a property)
        // total numbers of students in differnt schools in delhi ( school is a object with the property we define)


        var maruti = Car.Maruti(10)

        Toast.makeText(this, " maruti speed ${speed(maruti)}",Toast.LENGTH_SHORT).show()



        var bugati = Car.Bugatti(10 ,10)

        Toast.makeText(this, " bugati speed ${speed(bugati)}",Toast.LENGTH_SHORT).show()

    }


    fun speed(car: Car): Int = when (car) {
        is Car.Maruti -> car.speed
        is Car.Bugatti -> car.speed + car.boost
        Car.NotACar -> INVALID_SPEED
    // else clause is not required as we've covered all the cases
    }

}
