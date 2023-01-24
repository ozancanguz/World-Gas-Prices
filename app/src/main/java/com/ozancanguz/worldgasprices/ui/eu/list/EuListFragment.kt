package com.ozancanguz.worldgasprices.ui.eu.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.databinding.FragmentEuListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EuListFragment : Fragment() {

    private var _binding: FragmentEuListBinding? = null

    private val binding get() = _binding!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEuListBinding.inflate(inflater, container, false)
        val view = binding.root


        return view
    }


}