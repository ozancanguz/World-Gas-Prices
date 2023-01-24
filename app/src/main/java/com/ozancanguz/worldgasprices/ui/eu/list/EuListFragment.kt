package com.ozancanguz.worldgasprices.ui.eu.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.data.adapters.EuListAdapter
import com.ozancanguz.worldgasprices.databinding.FragmentEuListBinding
import com.ozancanguz.worldgasprices.viewmodel.EuViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EuListFragment : Fragment() {

    private var _binding: FragmentEuListBinding? = null

    private val binding get() = _binding!!

    private val euViewModel:EuViewModel by viewModels()
    private var euListAdapter=EuListAdapter()





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEuListBinding.inflate(inflater, container, false)
        val view = binding.root

        // setting up recyclerview
        setupRv()


        // observe data and update eu data
        observeEuData()


        return view
    }

    private fun observeEuData() {
        binding.euprogressBar.visibility=View.VISIBLE
        euViewModel.requestEuData()
        euViewModel.eudataList.observe(viewLifecycleOwner, Observer { euData ->
            euListAdapter.setData(euData)
            binding.euprogressBar.visibility=View.INVISIBLE
        })
    }

    private fun setupRv() {
        binding.eurecyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.eurecyclerView.adapter=euListAdapter

    }


}