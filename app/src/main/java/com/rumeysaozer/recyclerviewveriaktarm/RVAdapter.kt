package com.rumeysaozer.recyclerviewveriaktarm

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rumeysaozer.recyclerviewveriaktarm.databinding.ItemRowBinding

class RVAdapter(val countryList : ArrayList<Country>) :RecyclerView.Adapter<RVAdapter.ViewHolder>(){
class ViewHolder(val binding: ItemRowBinding):RecyclerView.ViewHolder(binding.root){

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textView2.text = countryList[position].county
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("country",countryList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return countryList.size
    }
}


