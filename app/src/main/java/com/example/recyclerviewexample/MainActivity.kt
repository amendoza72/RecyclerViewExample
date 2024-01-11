package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.model.Planet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerViewPlanets: RecyclerView = findViewById(R.id.recyclerViewPlanets)

        var planetList = generatePlanets()
    }


    fun generatePlanets(): ArrayList<Planet>{
        var planets = ArrayList<Planet>()



        return planets
    }
}