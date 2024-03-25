package com.example.fuelcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val btnIniciar:Button =findViewById(R.id.btn_iniciar)
        btnIniciar.setOnClickListener{

            val intent = Intent(this, PrecoCombustivel::class.java)
        startActivity(intent)
        }
    }
}