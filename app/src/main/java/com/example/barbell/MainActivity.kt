package com.example.barbell

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv = findViewById<TextView>(R.id.startTV)
        tv.setOnClickListener {
            var intent = Intent(this, BarbellActivity::class.java)
            startActivity(intent)
        }


    }
}