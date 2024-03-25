package com.example.fuelcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
 const val Key_Distancia= "Distancia.Key_Fuel"
class Distancia_destino : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distancia_destino)


        val edt_distancia=findViewById<EditText>(R.id.edtDistancia)
        val btnProximo = findViewById<Button>(R.id.btn_proximo)

        val Combustivel = intent.getStringExtra(Key_PrecoCombustivel)
        val Consumo = intent.getStringExtra(Key_ConsumoCarro)

        btnProximo.setOnClickListener{
            val Distancia= edt_distancia.text.toString()
            if (edt_distancia.text.isEmpty()){
                Snackbar.make(
                    edt_distancia,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                ) .show()
            }else {
                val intent = Intent(this, Resultado::class.java)
                intent.putExtra(Key_Distancia, Distancia)
                intent.putExtra(Key_PrecoCombustivel, Combustivel)
                intent.putExtra(Key_ConsumoCarro, Consumo)
                startActivity(intent)
            }
        }
    }
}