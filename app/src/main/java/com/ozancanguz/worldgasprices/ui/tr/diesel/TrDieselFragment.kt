package com.ozancanguz.worldgasprices.ui.tr.diesel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.data.adapters.TrDieselAdapter
import com.ozancanguz.worldgasprices.databinding.FragmentTrDieselBinding
import com.ozancanguz.worldgasprices.viewmodel.TrViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrDieselFragment : Fragment(), AdapterView.OnItemSelectedListener {

    private var _binding: FragmentTrDieselBinding? = null

    private val binding get() = _binding!!

    private val trViewModel:TrViewModel by viewModels()

    private val dieselAdapter=TrDieselAdapter()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         _binding = FragmentTrDieselBinding.inflate(inflater, container, false)
        val view = binding.root

        var arrayAdapter= ArrayAdapter.createFromResource(

            requireContext(),R.array.brands,
            android.R.layout.simple_spinner_item
        )

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.deiselspinner.adapter=arrayAdapter
        binding.deiselspinner.onItemSelectedListener=this

        // setting up rv
        setupRv()

        // observe diesel price data and update ui
        observeDieselData()

        return view
    }

    private fun observeDieselData() {
        binding.dieselsearch.setOnClickListener {
            binding.dieselpb.visibility=View.VISIBLE
            val city=binding.trdieseltv.text.toString()
            trViewModel.requestTrDieselData(city)
            trViewModel.trdieselData.observe(viewLifecycleOwner, Observer {
                dieselAdapter.setData(it)
                binding.dieselpb.visibility=View.INVISIBLE
            })
        }
    }

    private fun setupRv() {
        binding.trdieselrecyclerview.layoutManager=LinearLayoutManager(requireContext())
        binding.trdieselrecyclerview.adapter=dieselAdapter
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

        binding.trdieseltv.text=p0!!.getItemAtPosition(p2).toString()
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }


}