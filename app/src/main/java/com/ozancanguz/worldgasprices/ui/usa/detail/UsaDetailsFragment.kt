package com.ozancanguz.worldgasprices.ui.usa.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.databinding.FragmentUsaDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UsaDetailsFragment : Fragment() {

    private var _binding: FragmentUsaDetailsBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

          _binding = FragmentUsaDetailsBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }

}