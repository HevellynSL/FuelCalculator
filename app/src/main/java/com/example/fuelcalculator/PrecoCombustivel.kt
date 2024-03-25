package com.example.fuelcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

const val Key_PrecoCombustivel = "PrecoCombustivel.Key_Fuel"

class PrecoCombustivel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preco_combustivel)

        val pc_combustivel = findViewById<EditText>(R.id.edt_combustivel)


        val btnProximo = findViewById<Button>(R.id.btn_proximo)
        btnProximo.setOnClickListener {

            val Combustivel=  pc_combustivel.text.toString()

            if (pc_combustivel.text.isEmpty()) {
                     Snackbar.make(
                         pc_combustivel,
                         "Preencha os campos",
                         Snackbar.LENGTH_LONG
                     ).show()
            }else{ pc_combustivel.text.isNotEmpty()
             val intent= Intent(this,ConsumoCarro::class.java)
                intent.putExtra(Key_PrecoCombustivel,Combustivel)
                startActivity(intent)
            }

        }
    }
}

