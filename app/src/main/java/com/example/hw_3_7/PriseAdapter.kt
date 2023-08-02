package com.example.hw_3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.hw_3_7.databinding.ItemPriseBinding

class PriseAdapter (
    val priseList: ArrayList<Prise>, val onClick:(position:Int)->Unit
): Adapter<PriseAdapter.ViewHolder>() {

    inner class ViewHolder (private  val binding: ItemPriseBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(prise:Prise) {
            binding.apply {
                tvAlive.text = prise.alive
                tvName.text = prise.name
                Glide.with(ivPhoto).load(prise.logo).into(ivPhoto)
            }
            itemView.setOnClickListener{
                onClick(adapterPosition)
            }
        }

        fun bind() {
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemPriseBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return priseList.size
}



}