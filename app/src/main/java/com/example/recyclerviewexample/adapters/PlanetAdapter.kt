package com.example.recyclerviewexample.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.R
import com.example.recyclerviewexample.model.Planet

class PlanetAdapter(private val planetList: ArrayList<Planet>) : RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>(){

    private var onClickListener: OnClickListener? = null
    interface OnClickListener{
        fun onClick(planet: Planet)
    }
    class PlanetViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val textViewName : TextView
        val textViewType: TextView
        val imageViewPlanet: ImageView

        init{
            textViewName = itemView.findViewById(R.id.textViewName)
            textViewType = itemView.findViewById(R.id.textViewType)
            imageViewPlanet = itemView.findViewById(R.id.imageViewPlanet)
        }

        fun bind(planet: Planet, onClickListener: OnClickListener?,){
            textViewName.text = planet.name
            textViewType.text = planet.type
            imageViewPlanet.setImageResource(planet.image)

            itemView.setOnClickListener {
                onClickListener?.onClick(planet)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.planet_item, parent, false)
        return PlanetViewHolder(view)
    }

    override fun getItemCount() = planetList.size

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        //holder.textViewName.text = planetList[position].name
        //holder.textViewType.text = planetList[position].type
        //holder.imageViewPlanet.setImageResource(planetList[position].image)

        holder.bind(planetList[position], onClickListener)
    }

    fun setOnItemClickListener(onClickListener: OnClickListener){
        this.onClickListener = onClickListener
    }


}