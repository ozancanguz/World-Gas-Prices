package com.ozancanguz.worldgasprices.ui.tr.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.databinding.FragmentTrHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrHomeFragment : Fragment() {

       private var _binding: FragmentTrHomeBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         _binding = FragmentTrHomeBinding.inflate(inflater, container, false)
        val view = binding.root

       binding.trhomegasolinepart.setOnClickListener {
           findNavController().navigate(R.id.action_trHomeFragment_to_trGasolineFragment)
       }

        binding.trhomedieselpart.setOnClickListener {
            findNavController().navigate(R.id.action_trHomeFragment_to_trDieselFragment)
        }

        binding.trhomelpgpart.setOnClickListener {
            findNavController().navigate(R.id.action_trHomeFragment_to_trLpgFragment)
        }

        return view
    }


}