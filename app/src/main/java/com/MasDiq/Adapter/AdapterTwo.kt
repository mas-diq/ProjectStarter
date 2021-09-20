package com.MasDiq.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.MasDiq.Data.Data
import com.MasDiq.ProjectStarter.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.card_layout_two.view.*

class AdapterTwo(private val list: ArrayList<Data>) :
    RecyclerView.Adapter<AdapterTwo.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.card_layout_two, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        Glide.with(holder.itemView.context)
            .load(item.image)
            .apply(RequestOptions().override(200, 120))
            .into(holder.image)
        holder.title.text = item.title
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.imageCameraTwo!!
        val title = itemView.tv_titleTwo!!
    }
}