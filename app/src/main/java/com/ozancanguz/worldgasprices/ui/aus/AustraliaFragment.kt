package com.ozancanguz.worldgasprices.ui.aus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.databinding.FragmentAustraliaBinding


class AustraliaFragment : Fragment() {


      private var _binding: FragmentAustraliaBinding? = null

    private val binding get() = _binding!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         _binding = FragmentAustraliaBinding.inflate(inflater, container, false)
        val view = binding.root


        return view

    }


}