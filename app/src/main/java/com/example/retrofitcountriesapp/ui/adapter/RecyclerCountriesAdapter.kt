package com.example.retrofitcountriesapp.ui.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitcountriesapp.R
import com.example.retrofitcountriesapp.data.domain.model.CountryModel
import com.squareup.picasso.Picasso

class RecyclerCountriesAdapter(listCountry: List<CountryModel>): RecyclerView.Adapter<RecyclerCountriesAdapter.ViewHolder>() {

    private var listCountries = listCountry

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var txtCountryName: TextView
        var txtCapitalName: TextView
        var imgCountryFlag: ImageView
        var cardCountry: CardView

        init {
            txtCountryName = itemView.findViewById(R.id.txtCountryName)
            txtCapitalName = itemView.findViewById(R.id.txtCapitalName)
            imgCountryFlag = itemView.findViewById(R.id.imgCountryFlag)
            cardCountry = itemView.findViewById(R.id.cardCountry)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_countries, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.txtCountryName.text = listCountries[position].name
        viewHolder.txtCapitalName.text = listCountries[position].capital

        val image = Uri.parse(listCountries[position].href.toString())
        Picasso.get()
            .load(image)
            .error(R.drawable.image_map)
            .into(viewHolder.imgCountryFlag)
    }

    override fun getItemCount(): Int {
        return listCountries.size
    }
}