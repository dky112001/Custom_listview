package com.example.datepicker

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var context: Context, var arrayList: ArrayList<DataClass>): BaseAdapter() {
    override fun getCount(): Int {
      return arrayList.size
    }

    override fun getItem(p0: Int): Any {
       return arrayList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
       var layout =  LayoutInflater.from(context).inflate(R.layout.listmodel,null,false)
        var imageShow = layout.findViewById<ImageView>(R.id.imageShow)
        var nameShow = layout.findViewById<TextView>(R.id.nameShow)
        var addressShow = layout.findViewById<TextView>(R.id.addressShow)

        imageShow.setImageResource(arrayList[p0].image)
        nameShow.text=arrayList[p0].name
        addressShow.text=arrayList[p0].Address

        imageShow.setOnClickListener {

        var intent =Intent(context,MainActivity2::class.java)
        intent.putExtra("image",arrayList[p0].image)
        intent.putExtra("name",arrayList[p0].name)
        intent.putExtra("address",arrayList[p0].Address)

        context.startActivity(intent)

        }
        return layout


    }
}