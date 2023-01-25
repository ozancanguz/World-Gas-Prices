package com.ozancanguz.worldgasprices.ui.tr.gasoline

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
import com.ozancanguz.worldgasprices.data.adapters.TrGasolineAdapter
import com.ozancanguz.worldgasprices.databinding.FragmentTrGasolineBinding
import com.ozancanguz.worldgasprices.viewmodel.TrViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_tr_gasoline.*

@AndroidEntryPoint
class TrGasolineFragment : Fragment() ,AdapterView.OnItemSelectedListener{

    private var _binding: FragmentTrGasolineBinding? = null

    private val binding get() = _binding!!

    private val trViewModel:TrViewModel by viewModels()

    private val trGasolineAdapter=TrGasolineAdapter()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         _binding = FragmentTrGasolineBinding.inflate(inflater, container, false)
        val view = binding.root

          var arrayAdapter=ArrayAdapter.createFromResource(

              requireContext(),R.array.brands,
              android.R.layout.simple_spinner_item
          )

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner3.adapter=arrayAdapter
        binding.spinner3.onItemSelectedListener=this



        // set up rv
        setupRv()

        // observe data and update ui
        observeTrGasolineData()

        return view
    }

    private fun observeTrGasolineData() {
       binding.searchbtn.setOnClickListener {
           binding.trgasolinepb.visibility=View.VISIBLE
           val city=binding.brandtv.text.toString()
           trViewModel.requestTrGasolineData(city)
           trViewModel.trgasolineData.observe(viewLifecycleOwner, Observer {
               trGasolineAdapter.setData(it)
               binding.trgasolinepb.visibility=View.INVISIBLE

           })
       }
    }

    private fun setupRv() {
        binding.searchnameRv.layoutManager=LinearLayoutManager(requireContext())
        binding.searchnameRv.adapter=trGasolineAdapter
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        binding.brandtv.text=parent!!.getItemAtPosition(position).toString()


    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }

}