package com.example.datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView=findViewById<ListView>(R.id.listView)

        var whatsapplist = arrayListOf(
            DataClass(R.drawable.ic_launcher_background,"DEEpak kumar","Dighhwara"),
            DataClass(R.drawable.ic_launcher_foreground,"rahil Kumar","Dighwara")

        )

        var adapter=CustomAdapter(this,whatsapplist)
        listView.adapter=adapter



    }
}