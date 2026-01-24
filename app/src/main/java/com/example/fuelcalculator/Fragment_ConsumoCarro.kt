package com.example.fuelcalculator

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.fuelcalculator.databinding.FragmentConsumoBinding
import com.google.android.material.snackbar.Snackbar


class ConsumoCarro : Fragment(R.layout.fragment_consumo) {
    private var _binding : FragmentConsumoBinding? = null
    private val binding get() = _binding!!

    private val viewModel : FuelViewModel by activityViewModels ()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentConsumoBinding.bind(view)



        binding.btnProximo.setOnClickListener {
            val consumo_Texto = binding.edtConsumo.text.toString()
            if (consumo_Texto.isEmpty()){
                Snackbar.make(
                    binding.root,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                ) .show()
            }else{
                viewModel.consumoCarro = consumo_Texto.toDoubleOrNull() ?: 0.0

                findNavController().navigate(R.id.action_consumoCarro_to_distancia_destino)
            }

        }


    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

