package com.example.fuelcalculator

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fuelcalculator.databinding.FragmentInicioBinding

class Fragment_Inicio : Fragment(R.layout.fragment_inicio) {

    private var _binding : FragmentInicioBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentInicioBinding.bind(view)

        binding.btnCalcular.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_Inicio_to_precoCombustivel)
        }



    }


}