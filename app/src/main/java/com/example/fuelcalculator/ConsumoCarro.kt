package com.example.fuelcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

const val Key_ConsumoCarro= "ConsumoCarro.Key_Fuel"
class ConsumoCarro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumo_carro)

        val edt_Consumo=findViewById<EditText>(R.id.edtConsumo)
        val btnProximo=findViewById<Button>(R.id.btn_proximo)

        val Combustivel = intent.getStringExtra(Key_PrecoCombustivel)

        btnProximo.setOnClickListener{
            val Consumo= edt_Consumo.text.toString()
            if (edt_Consumo.text.isEmpty()){
                Snackbar.make(
                    edt_Consumo,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                ) .show()
            }else{
                val intent = Intent(this, Distancia_destino::class.java)
                intent.putExtra(Key_PrecoCombustivel, Combustivel)
                intent.putExtra(Key_ConsumoCarro, Consumo)
                startActivity(intent)
            }
        }
    }
}

