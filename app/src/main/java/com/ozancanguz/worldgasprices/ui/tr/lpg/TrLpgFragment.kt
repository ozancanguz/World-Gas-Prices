package com.ozancanguz.worldgasprices.ui.tr.lpg

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.databinding.FragmentTrLpgBinding


class TrLpgFragment : Fragment() {

     private var _binding: FragmentTrLpgBinding? = null

    private val binding get() = _binding!!





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         _binding = FragmentTrLpgBinding.inflate(inflater, container, false)
        val view = binding.root

        var arrayAdapter= ArrayAdapter.createFromResource(

            requireContext(),R.array.brands,
            android.R.layout.simple_spinner_item
        )

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.trlpgspinner.adapter=arrayAdapter



        return view
    }


}