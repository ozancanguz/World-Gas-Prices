package com.ozancanguz.worldgasprices.data.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.data.models.eu.EuModel
import com.ozancanguz.worldgasprices.data.models.eu.EuResult
import kotlinx.android.synthetic.main.eu_row_layout.view.*

class EuListAdapter:RecyclerView.Adapter<EuListAdapter.EuListViewHolder>() {
    class EuListViewHolder(view: View):RecyclerView.ViewHolder(view) {

    }

    var eulistData= emptyList<EuResult>()

    fun setData(newData:EuModel){
        this.eulistData=newData.results
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EuListViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.eu_row_layout,parent,false)
        return EuListViewHolder(view)
    }

    override fun onBindViewHolder(holder: EuListViewHolder, position: Int) {
        val currentEuData=eulistData[position]
        holder.itemView.countrytv.text=currentEuData.country
        holder.itemView.currencyTv.text=currentEuData.currency
        holder.itemView.dieselTv.text=currentEuData.diesel
        holder.itemView.gasolinetv.text=currentEuData.gasoline
        holder.itemView.lpgtv.text=currentEuData.lpg
        holder.itemView.euimageview.setImageResource(R.drawable.eu2)
    }

    override fun getItemCount(): Int {
        return eulistData.size
    }


}