package com.example.fuelcalculator

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.fuelcalculator.databinding.FragmentResultadoBinding

class Fragment_Resultado : Fragment(R.layout.fragment_resultado) {
    private var _binding: FragmentResultadoBinding? = null
    private val binding get() = _binding!!

    private val viewModel: FuelViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentResultadoBinding.bind(view)

        //Pegar os dados do ViewModel
        binding.pcUsuario.text = "€${viewModel.precoCombustivel}"
        binding.consumoUsuario.text = "€${viewModel.consumoCarro} km/l"
        binding.distanciaUsuario.text = "€${viewModel.distanciaViagem} km"

        //Chamar a função de cálculo
        val resultadoFinal = viewModel.calcularTotal()

        //Exibir resultado
        binding.txtResultado.text = String.format("€ %.2f", resultadoFinal)

        // Configurar botão para novo cálculo
        binding.btnNovocalc.setOnClickListener {


            //Volta para a tela inicial
            findNavController().navigate(R.id.action_fragment_Resultado_to_fragment_Inicio)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}