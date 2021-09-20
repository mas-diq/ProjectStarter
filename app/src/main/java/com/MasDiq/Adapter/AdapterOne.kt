package com.MasDiq.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.MasDiq.Data.Data
import com.MasDiq.ProjectStarter.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.card_layout_one.view.*

class AdapterOne(private val listCamera: ArrayList<Data>) :
    RecyclerView.Adapter<AdapterOne.ViewHolder>() {

    var onClickItem: ((Data) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.card_layout_one, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listCamera[position]
        Glide.with(holder.itemView.context)
            .load(item.image)
            .apply(RequestOptions().override(540, 360))
            .into(holder.image)
        holder.title.text = item.title
        holder.subtitle.text = item.subtitle
        holder.price.text = item.price
    }

    override fun getItemCount(): Int {
        return listCamera.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.imageCamera!!
        val title = itemView.tv_title!!
        val subtitle = itemView.tv_subtitle!!
        val price = itemView.tv_price!!

        init {
            itemView.setOnClickListener {
                onClickItem?.invoke(listCamera[adapterPosition])
            }
        }
    }
}