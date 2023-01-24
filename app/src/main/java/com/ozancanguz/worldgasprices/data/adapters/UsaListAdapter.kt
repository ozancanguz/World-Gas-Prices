package com.ozancanguz.worldgasprices.data.adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.data.models.usa.Usa
import com.ozancanguz.worldgasprices.data.models.usa.UsaResult
import com.ozancanguz.worldgasprices.ui.usa.list.UsaListFragment
import com.ozancanguz.worldgasprices.ui.usa.list.UsaListFragmentDirections
import com.ozancanguz.worldgasprices.ui.usa.list.UsaListFragmentDirections.ActionUsaListFragmentToUsaDetailsFragment
import kotlinx.android.synthetic.main.fragment_usa_list.view.*
import kotlinx.android.synthetic.main.usa_row_layout.view.*

class UsaListAdapter:RecyclerView.Adapter<UsaListAdapter.UsaListViewHolder>() {
    class UsaListViewHolder(view: View):RecyclerView.ViewHolder(view) {

    }

    var usadatalist= emptyList<UsaResult>()

    fun setData(newData: Usa){
        this.usadatalist=newData.result
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsaListViewHolder {
      val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.usa_row_layout,parent,false)
        return UsaListViewHolder(view)
    }

    override fun onBindViewHolder(holder: UsaListViewHolder, position: Int) {
       val currentUsaData=usadatalist[position]
        holder.itemView.usaListTv.text=currentUsaData.name
        holder.itemView.usalistimageView.setImageResource(R.drawable.usapng)

        holder.itemView.setOnClickListener {
            val action=UsaListFragmentDirections.actionUsaListFragmentToUsaDetailsFragment(currentUsaData)
            holder.itemView.findNavController().navigate(action)
        }




    }

    override fun getItemCount(): Int {
        return usadatalist.size
    }


}