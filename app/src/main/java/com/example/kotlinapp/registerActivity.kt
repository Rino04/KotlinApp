package com.example.kotlinapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.next_button_register
import kotlinx.android.synthetic.main.activity_register.*

class registerActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        email_button_register.setOnClickListener {
            Log.d("registerActivity", "Try to show login Messages")

            //Launch the login activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        next_button_register.setOnClickListener {
            //Launch the map activity
            val intent = Intent(this, mapsActivity::class.java)
            startActivity(intent)
        }
    }
}