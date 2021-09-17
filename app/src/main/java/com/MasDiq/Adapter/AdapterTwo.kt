package com.MasDiq.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.MasDiq.Data.DataCamera
import com.MasDiq.ProjectStarter.R
import kotlinx.android.synthetic.main.card_layout_two.view.*

class AdapterTwo(private val cameraList: ArrayList<DataCamera>) :
    RecyclerView.Adapter<AdapterTwo.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterTwo.ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.card_layout_two, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = cameraList[position]
        holder.image.setImageResource(item.image)
        holder.title.text = item.title
    }

    override fun getItemCount(): Int {
        return cameraList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.imageCameraTwo!!
        val title = itemView.tv_titleTwo!!
    }
}