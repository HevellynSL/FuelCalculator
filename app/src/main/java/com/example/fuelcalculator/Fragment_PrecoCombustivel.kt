package com.example.fuelcalculator

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.fuelcalculator.databinding.FragmentPrecoCombustivelBinding
import com.google.android.material.snackbar.Snackbar


class PrecoCombustivel : Fragment(R.layout.fragment_preco_combustivel) {

    private var _binding : FragmentPrecoCombustivelBinding? = null
    private val binding get() = _binding!!

    private val viewModel: FuelViewModel  by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding= FragmentPrecoCombustivelBinding.bind(view)

        val pc_combustivel = binding.edtCombustivel

        binding.btnProximo.setOnClickListener {
            val combustivelTexto=  pc_combustivel.text.toString()

         if (pc_combustivel.text.isEmpty()) {
                Snackbar.make(
                    pc_combustivel,
                   "Preencha os campos",
                   Snackbar.LENGTH_LONG
               ).show()
           }else if(pc_combustivel.text.isNotEmpty()){

               viewModel.precoCombustivel = combustivelTexto.toDoubleOrNull() ?: 0.0
                findNavController().navigate(R.id.action_precoCombustivel_to_consumoCarro)
          }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}


