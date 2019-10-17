package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email_editview_register.setOnClickListener {

            val email = email_editview_register.text.toString()

            Log.d("MainActivity", "Email is:" + email)
        }
        email_editview_register.setOnClickListener {
            Log.d("MainActivity", "Try to show login Messages")

            //Launch the login activity
            val intent = Intent(this, registerActivity::class.java)
            startActivity(intent)
        }
        next_button_register.setOnClickListener {
            //Launch the map activity
            val intent = Intent(this, mapsActivity::class.java)
            startActivity(intent)
        }
    }
}
