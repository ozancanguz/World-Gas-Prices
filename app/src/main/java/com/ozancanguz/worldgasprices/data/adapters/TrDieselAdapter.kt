package com.ozancanguz.worldgasprices.data.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.data.models.tr.diesel.TrDieselModel
import com.ozancanguz.worldgasprices.data.models.tr.diesel.TrDieselResult
import kotlinx.android.synthetic.main.tr_gasoline_rv.view.*
import kotlinx.android.synthetic.main.trdiesel_rowlayout.view.*

class TrDieselAdapter:RecyclerView.Adapter<TrDieselAdapter.TrDieselViewHolder>() {
    class TrDieselViewHolder(view: View):RecyclerView.ViewHolder(view) {

    }

    var trdieselList= emptyList<TrDieselResult>()

    fun setData(newData:TrDieselModel){
        this.trdieselList=newData.result
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrDieselViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.trdiesel_rowlayout,parent,false)
        return TrDieselViewHolder(view)
    }

    override fun onBindViewHolder(holder: TrDieselViewHolder, position: Int) {
       val currentDieselModel=trdieselList[position]
        holder.itemView.trdieselrvimageview.setImageResource(R.drawable.dieselhome)
        holder.itemView.RvBrandDieselTv.text="Brand: " +currentDieselModel.marka
        holder.itemView.RvDieselPriceTv.text="Price: " +currentDieselModel.dizel.toString() + "TL"
        holder.itemView.RvDieselAddedTv.text="Added Price: " +currentDieselModel.katkili.toString() + " TL"


    }

    override fun getItemCount(): Int {
        return trdieselList.size
    }


}