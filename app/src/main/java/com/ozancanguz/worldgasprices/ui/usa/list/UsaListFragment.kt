package com.ozancanguz.worldgasprices.ui.usa.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.data.adapters.UsaListAdapter
import com.ozancanguz.worldgasprices.databinding.FragmentUsaListBinding
import com.ozancanguz.worldgasprices.viewmodel.UsaViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UsaListFragment : Fragment() {
    private var _binding: FragmentUsaListBinding? = null

    private val binding get() = _binding!!

    // init viewmodel
    private val usaviewmodel:UsaViewModel by viewModels()

    // init adapter
    private val usaListAdapter=UsaListAdapter()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUsaListBinding.inflate(inflater, container, false)
        val view = binding.root

        // setup recyclerview process
        setupRv()

        // observe data and update ui
       observeUsaData()


        return view
    }

    private fun observeUsaData() {

        binding.usaprogressBar.visibility=View.VISIBLE
       usaviewmodel.requestUsaData()
        usaviewmodel.usaDataList.observe(viewLifecycleOwner, Observer { usaList ->
            usaListAdapter.setData(usaList)
            binding.usaprogressBar.visibility=View.INVISIBLE
        })
    }

    private fun setupRv() {
        binding.usalistrecyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.usalistrecyclerView.adapter=usaListAdapter
    }


}