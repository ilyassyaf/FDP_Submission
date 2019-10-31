package com.ilyassyaf.mysubmission

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.laptop_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.laptop_detail)

        val navBarTitle = intent.getStringExtra(LaptopViewHolder.LAPTOP_NAME)
        supportActionBar?.title = navBarTitle

        val name: String? = intent.getStringExtra(LaptopViewHolder.LAPTOP_NAME)
        val price: String? = intent.getStringExtra(LaptopViewHolder.LAPTOP_PRICE)
        val cpu: String? = intent.getStringExtra(LaptopViewHolder.LAPTOP_CPU)
        val graphics: String? = intent.getStringExtra(LaptopViewHolder.LAPTOP_GRAPHICS)
        val ram: String? = intent.getStringExtra(LaptopViewHolder.LAPTOP_RAM)
        val screen: String? = intent.getStringExtra(LaptopViewHolder.LAPTOP_SCREEN)
        val storage: String? = intent.getStringExtra(LaptopViewHolder.LAPTOP_STORAGE)
        val description: String? = intent.getStringExtra(LaptopViewHolder.LAPTOP_DESCRIPTION)
        val image: Int = intent.getIntExtra(LaptopViewHolder.LAPTOP_IMAGE, 1)

        img_laptop.setImageResource(LaptopData.getImage(image))
        tv_laptop_name.text = name
        tv_laptop_price.text = price
        tv_description.text = description
        tv_cpu.text = cpu
        tv_graphics.text = graphics
        tv_ram.text = ram
        tv_screen.text = screen
        tv_storage.text = storage
        btn_buy.setOnClickListener {
            Toast.makeText(baseContext, "Buy $name", Toast.LENGTH_SHORT).show()
        }
    }
}