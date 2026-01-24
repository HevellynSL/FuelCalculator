package com.example.fuelcalculator

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.fuelcalculator.databinding.FragmentDistanciaBinding
import com.google.android.material.snackbar.Snackbar

class Distancia_destino : Fragment(R.layout.fragment_distancia) {

    private var _binding : FragmentDistanciaBinding? = null
    private val binding get() = _binding!!

    private val viewModel : FuelViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentDistanciaBinding.bind(view)

        binding.btnProximo.setOnClickListener {
            val distanciaTexto = binding.edtDistancia.text.toString()

            if (distanciaTexto.isEmpty()){
                Snackbar.make(
                    binding.root,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                ).show()

            }else {
                viewModel.distanciaViagem = distanciaTexto.toDoubleOrNull() ?: 0.0

                findNavController().navigate(R.id.action_distancia_destino_to_fragment_Resultado)

            }

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}