package com.ozancanguz.worldgasprices.ui.eu.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.databinding.FragmentEuDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EuDetailsFragment : Fragment() {

    private var _binding: FragmentEuDetailsBinding? = null

    private val binding get() = _binding!!

    private val args:EuDetailsFragmentArgs by navArgs()





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEuDetailsBinding.inflate(inflater, container, false)
        val view = binding.root


        updateUi()

        return view
    }

    private fun updateUi() {

    }


}