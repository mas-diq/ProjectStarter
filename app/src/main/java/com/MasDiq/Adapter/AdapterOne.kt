package com.MasDiq.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.MasDiq.Data.DataCamera
import com.MasDiq.ProjectStarter.R
import kotlinx.android.synthetic.main.card_layout_one.view.*

class AdapterOne(private val cameraList: ArrayList<DataCamera>) :
    RecyclerView.Adapter<AdapterOne.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.card_layout_one, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = cameraList[position]
        holder.image.setImageResource(item.image)
        holder.title.text = item.title
        holder.subtitle.text = item.subtitle
    }

    override fun getItemCount(): Int {
        return cameraList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.tv_title!!
        val subtitle = itemView.tv_subtitle!!
        val image = itemView.imageCamera!!
    }
}