package com.ozancanguz.worldgasprices.ui.usa.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.databinding.FragmentUsaDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UsaDetailsFragment : Fragment() {

    private var _binding: FragmentUsaDetailsBinding? = null

    private val binding get() = _binding!!

    private val args:UsaDetailsFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

          _binding = FragmentUsaDetailsBinding.inflate(inflater, container, false)
        val view = binding.root

        updateUi()

        return view
    }

    private fun updateUi() {
        val args=args.currenusadata
        binding.nameTv.text="Name: " +args.name
        binding.currencyText.text="Currency: " +args.currency
        binding.dieselPriceTv.text="Diesel Price: " +args.diesel + " $"
        binding.gasolinepricetv.text="Gasoline Price: "+args.gasoline + "$"
        binding.midgradetv.text="Mid Grade:  " +args.midGrade + "$"
        binding.premiumtv.text="Premium Price " +args.premium + "$"
        binding.imageView.setImageResource(R.drawable.usapng)
    }

}