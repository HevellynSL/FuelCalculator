package com.example.fuelcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val precoCombustivel= intent.getStringExtra(Key_PrecoCombustivel)?.toDoubleOrNull()
        val consumoCarro= intent.getStringExtra(Key_ConsumoCarro)?.toDoubleOrNull()
        val distanciaViagem=intent.getStringExtra(Key_Distancia)?.toDoubleOrNull()

        val txt_preco=findViewById<TextView>(R.id.pc_usuario)
        val txt_consumo=findViewById<TextView>(R.id.consumo_usuario)
        val txt_distancia=findViewById<TextView>(R.id.distancia_usuario)
        val txtPrecoViagem = findViewById<TextView>(R.id.txt_resultado)

        txt_preco.text="€$precoCombustivel"
        txt_consumo.text=consumoCarro.toString()
        txt_distancia.text=distanciaViagem.toString()

        val litragemCombust = (consumoCarro ?: 0.0) * (distanciaViagem ?: 0.0) /100
        val precoTotalViagem = (precoCombustivel ?:0.0) * litragemCombust

        txtPrecoViagem.text = String.format("€%.2f", precoTotalViagem)


        val btn_novoCalc=findViewById<Button>(R.id.btn_novocalc)
        btn_novoCalc.setOnClickListener{
            val intent=Intent (this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}