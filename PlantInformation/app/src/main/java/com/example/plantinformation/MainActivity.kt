package com.example.plantinformation

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var lv:ListView=findViewById(R.id.listView)

        var plant= arrayOf("Tulsi","Alovera","Neem","Termeric","Aamla","Ashwagandha","Shatavari","Kothmir","Ginger","Mint","Fennel")
        var adapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,plant)
        lv.adapter=adapter

        lv.setOnItemClickListener { adapterView, view, i, l ->
            var value=lv.getItemAtPosition(i).toString()
            if(i==0)
            {
                var i=Intent(this,TulsiActivity::class.java)
                startActivity(i)
            }
            if(i==1)
            {
                var i=Intent(this,AloveraActivity::class.java)
                startActivity(i)
            }
            if(i==2)
            {
                var i=Intent(this,NeemActivity::class.java)
                startActivity(i)
            }
            if(i==3)
            {
                var i=Intent(this,TermericActivity::class.java)
                startActivity(i)
            }
            if(i==4)
            {
                var i=Intent(this,AamlaActivity::class.java)
                startActivity(i)
            }

        }
    }
}