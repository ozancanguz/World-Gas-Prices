package com.ozancanguz.worldgasprices.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.databinding.FragmentHomeScreenBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeScreen : Fragment() {
     private var _binding: FragmentHomeScreenBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeScreenBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.homescreenUsaPart.setOnClickListener {
            binding.homescreenprogress.visibility=View.VISIBLE

            findNavController().navigate(R.id.action_homeScreen_to_usaListFragment)
            binding.homescreenprogress.visibility=View.INVISIBLE
        }

        binding.homescreenEuPart.setOnClickListener {
            binding.homescreenprogress.visibility=View.VISIBLE
            findNavController().navigate(R.id.action_homeScreen_to_euListFragment)
            binding.homescreenprogress.visibility=View.INVISIBLE
        }

        binding.homescreenTurkeyPart.setOnClickListener {
            binding.homescreenprogress.visibility=View.VISIBLE
            findNavController().navigate(R.id.action_homeScreen_to_trHomeFragment)
            binding.homescreenprogress.visibility=View.INVISIBLE
        }


        return view
    }


}