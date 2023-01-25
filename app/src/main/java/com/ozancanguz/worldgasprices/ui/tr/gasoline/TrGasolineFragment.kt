package com.ozancanguz.worldgasprices.ui.tr.gasoline

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.databinding.FragmentTrGasolineBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_tr_gasoline.*

@AndroidEntryPoint
class TrGasolineFragment : Fragment() {

    private var _binding: FragmentTrGasolineBinding? = null

    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         _binding = FragmentTrGasolineBinding.inflate(inflater, container, false)
        val view = binding.root

          var arrayAdapter=ArrayAdapter.createFromResource(

              requireContext(),R.array.brands,
              android.R.layout.simple_spinner_item
          )

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner3.adapter=arrayAdapter


        return view
    }

}