package com.example.datepicker

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var imageGet = findViewById<ImageView>(R.id.imageGet)
        var nameGet = findViewById<TextView>(R.id.nameGet)
        var addressGet = findViewById<TextView>(R.id.addressGet)

     var imageget =   intent.extras?.getInt("image")
     var nameget =   intent.extras?.getString("name")
     var addressget =   intent.extras?.getString("address")


        if (imageget != null) {
            imageGet.setImageResource(imageget)
        }

        nameGet.text=nameget
        addressGet.text=addressget

    }
}

