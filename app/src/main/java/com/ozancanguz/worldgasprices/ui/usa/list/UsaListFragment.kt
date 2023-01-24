package com.ozancanguz.worldgasprices.ui.usa.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.databinding.FragmentUsaListBinding

class UsaListFragment : Fragment() {
    private var _binding: FragmentUsaListBinding? = null

    private val binding get() = _binding!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUsaListBinding.inflate(inflater, container, false)
        val view = binding.root




        return view
    }


}