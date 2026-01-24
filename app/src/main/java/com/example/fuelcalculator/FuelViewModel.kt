package com.example.fuelcalculator

import androidx.lifecycle.ViewModel

class FuelViewModel : ViewModel() {
    var precoCombustivel: Double = 0.0
    var consumoCarro: Double = 0.0
    var distanciaViagem: Double = 0.0

    fun calcularTotal(): Double {
        val litragem = (consumoCarro * distanciaViagem) / 100
        return precoCombustivel * litragem
    }
}