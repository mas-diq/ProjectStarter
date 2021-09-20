package com.MasDiq.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.MasDiq.Data.Data
import com.MasDiq.ProjectStarter.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.card_layout_canon.view.*

class AdapterCanon(private val list: ArrayList<Data>) :
    RecyclerView.Adapter<AdapterCanon.ViewHolder>() {

    var onClickItem: ((Data) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.card_layout_canon, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        Glide.with(holder.itemView.context)
            .load(item.image)
            .apply(RequestOptions().override(600, 600))
            .into(holder.image)
        holder.title.text = item.title
        holder.price.text = item.price
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.imageCameraTwo!!
        val title = itemView.tv_titleCanon!!
        val price = itemView.tv_price_canon!!

        init {
            itemView.setOnClickListener {
                onClickItem?.invoke(list[adapterPosition])
            }
        }
    }
}