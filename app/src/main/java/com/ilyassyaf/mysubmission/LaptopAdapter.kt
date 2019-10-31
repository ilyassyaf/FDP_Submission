package com.ilyassyaf.mysubmission

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.laptop_row.view.*
import java.text.FieldPosition

class LaptopAdapter(private val listLaptop: ArrayList<Laptop>): RecyclerView.Adapter<LaptopViewHolder>(){

    override fun getItemCount(): Int {
        return listLaptop.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaptopViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.laptop_row, parent, false)
        return LaptopViewHolder(cellForRow)
    }
    override fun onBindViewHolder(holder: LaptopViewHolder, position: Int) {
        val laptop = listLaptop[position]
        Glide.with(holder.itemView.context)
            .load(laptop.photo)
            .into(holder.itemView.img_laptop)
        holder.itemView?.tv_laptop_name?.text = laptop.name
        holder.itemView?.tv_laptop_price?.text = laptop.price

        holder?.laptop = laptop
        holder?.pos = position
    }
}

class LaptopViewHolder(val view: View, var laptop: Laptop? = null, var pos: Int? = null): RecyclerView.ViewHolder(view){

    companion object {
        val LAPTOP_NAME = "laptop name"
        val LAPTOP_PRICE = "laptop price"
        val LAPTOP_CPU = "laptop cpu"
        val LAPTOP_GRAPHICS = "laptop graphics"
        val LAPTOP_RAM = "laptop ram"
        val LAPTOP_SCREEN = "laptop screen"
        val LAPTOP_STORAGE = "laptop storage"
        val LAPTOP_DESCRIPTION = "laptop description"
        val LAPTOP_IMAGE = ""
    }

    init {
        view.setOnClickListener {
            val intent = Intent(view.context, DetailActivity::class.java)
            intent.putExtra(LAPTOP_NAME, laptop?.name)
            intent.putExtra(LAPTOP_PRICE, laptop?.price)
            intent.putExtra(LAPTOP_CPU, laptop?.cpu)
            intent.putExtra(LAPTOP_GRAPHICS, laptop?.graphics)
            intent.putExtra(LAPTOP_RAM, laptop?.ram)
            intent.putExtra(LAPTOP_SCREEN, laptop?.screen)
            intent.putExtra(LAPTOP_STORAGE, laptop?.storage)
            intent.putExtra(LAPTOP_DESCRIPTION, laptop?.description)
            intent.putExtra(LAPTOP_IMAGE, pos)
            view.context.startActivity(intent)
        }
        view.btn_detail.setOnClickListener {
            val intent = Intent(view.context, DetailActivity::class.java)
            intent.putExtra(LAPTOP_NAME, laptop?.name)
            intent.putExtra(LAPTOP_PRICE, laptop?.price)
            intent.putExtra(LAPTOP_CPU, laptop?.cpu)
            intent.putExtra(LAPTOP_GRAPHICS, laptop?.graphics)
            intent.putExtra(LAPTOP_RAM, laptop?.ram)
            intent.putExtra(LAPTOP_SCREEN, laptop?.screen)
            intent.putExtra(LAPTOP_STORAGE, laptop?.storage)
            intent.putExtra(LAPTOP_DESCRIPTION, laptop?.description)
            intent.putExtra(LAPTOP_IMAGE, pos)
            view.context.startActivity(intent)
        }
        view.btn_beli.setOnClickListener {
            Toast.makeText(itemView.context, "Buy " + laptop?.name, Toast.LENGTH_SHORT).show()
        }
    }
}