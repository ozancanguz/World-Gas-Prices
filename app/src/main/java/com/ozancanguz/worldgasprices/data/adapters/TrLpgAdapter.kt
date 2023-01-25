package com.ozancanguz.worldgasprices.data.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.data.models.tr.lpg.TrLpgModel
import com.ozancanguz.worldgasprices.data.models.tr.lpg.TrLpgResult
import kotlinx.android.synthetic.main.trlpg_row_layout.view.*

class TrLpgAdapter:RecyclerView.Adapter<TrLpgAdapter.TrLpgViewHolder>(){
    class TrLpgViewHolder(view: View):RecyclerView.ViewHolder(view){

    }

    var trlpglist= emptyList<TrLpgResult>()

    fun setData(newData:TrLpgModel){
        this.trlpglist=newData.result
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrLpgViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.trlpg_row_layout,parent,false)
        return TrLpgViewHolder(view)
    }

    override fun onBindViewHolder(holder: TrLpgViewHolder, position: Int) {
       val currentLpg=trlpglist[position]
        holder.itemView.trlpgRVimageview.setImageResource(R.drawable.lpghome)
        holder.itemView.trlpgRVbrandtv.text="Brand: " +currentLpg.marka
        holder.itemView.trlpgRVpricetv.text="Price: " +currentLpg.lpg.toString() + "TL"


    }

    override fun getItemCount(): Int {
        return trlpglist.size
    }
}