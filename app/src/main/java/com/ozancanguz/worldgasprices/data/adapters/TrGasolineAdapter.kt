package com.ozancanguz.worldgasprices.data.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.worldgasprices.R
import com.ozancanguz.worldgasprices.data.models.tr.gasoline.TrGasolineModel
import com.ozancanguz.worldgasprices.data.models.tr.gasoline.TrGasolineResult
import kotlinx.android.synthetic.main.tr_gasoline_rv.view.*

class TrGasolineAdapter:RecyclerView.Adapter<TrGasolineAdapter.TrViewHolder>() {
    class TrViewHolder(view: View):RecyclerView.ViewHolder(view){

    }

    var trgasolineList= emptyList<TrGasolineResult>()

    fun setData(newData:TrGasolineModel){
        this.trgasolineList=newData.result
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.tr_gasoline_rv,parent,false)
        return TrViewHolder(view)
    }

    override fun onBindViewHolder(holder: TrViewHolder, position: Int) {
        val currentGasoline=trgasolineList[position]
        holder.itemView.imageView.setImageResource(R.drawable.trgasoline)
        holder.itemView.Rvbrandtextview.text="Brand: " +currentGasoline.marka
        holder.itemView.Rvkatkilitv.text="Added Price: " +currentGasoline.katkili.toString() +"TL"
        holder.itemView.RvgasolinePricetv.text="Price: " +currentGasoline.benzin.toString() + "TL"

    }

    override fun getItemCount(): Int {
      return trgasolineList.size
    }

}