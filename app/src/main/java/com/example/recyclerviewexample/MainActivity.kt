package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.adapters.PlanetAdapter
import com.example.recyclerviewexample.model.Planet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerViewPlanets: RecyclerView = findViewById(R.id.recyclerViewPlanets)
        var planetList = generatePlanets()
        var planetAdapter = PlanetAdapter(planetList)
        recyclerViewPlanets.adapter = planetAdapter

        recyclerViewPlanets.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        planetAdapter.setOnItemClickListener(object : PlanetAdapter.OnClickListener{
            override fun onClick(planet: Planet){
                Toast.makeText(applicationContext, planet.name, Toast.LENGTH_LONG).show()
            }
        })
    }


    fun generatePlanets(): ArrayList<Planet>{
        var planets = ArrayList<Planet>()
        var planet = Planet("Mercurio", "Terrestre", R.drawable.mercurio)
        planets.add(planet)
        planet = Planet("Venus", "Terrestre", R.drawable.venus)
        planets.add(planet)
        planet = Planet("Tierra", "Terrestre", R.drawable.tierra)
        planets.add(planet)
        planet = Planet("Marte", "Terrestre", R.drawable.marte)
        planets.add(planet)
        planet = Planet("Jupiter", "Gigante gaseoso", R.drawable.jupiter)
        planets.add(planet)
        planet = Planet("Saturno", "Gigante gaseoso", R.drawable.saturno)
        planets.add(planet)
        planet = Planet("Urano", "Gigante helado", R.drawable.urano)
        planets.add(planet)
        planet = Planet("Neptuno", "Gigante helado", R.drawable.neptuno)
        planets.add(planet)
        return planets
    }
}