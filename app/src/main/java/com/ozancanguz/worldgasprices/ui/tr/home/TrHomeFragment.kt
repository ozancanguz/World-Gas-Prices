package com.ozancanguz.worldgasprices.ui.tr.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.databinding.FragmentTrHomeBinding


class TrHomeFragment : Fragment() {

       private var _binding: FragmentTrHomeBinding? = null

    private val binding get() = _binding!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         _binding = FragmentTrHomeBinding.inflate(inflater, container, false)
        val view = binding.root


        return view
    }


}