package com.MasDiq.ProjectStarter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.MasDiq.Adapter.AdapterOne
import com.MasDiq.Adapter.AdapterTwo
import com.MasDiq.Data.Data
import com.MasDiq.Data.DataCamera
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var list: ArrayList<Data> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Change status bar colors
        val window = this.window
        window.statusBarColor = this.resources.getColor(R.color.primaryColor)

        list.addAll(DataCamera.listCamera)
        // RecyclerView
        recycleOne()
        recycleTwo()

    }

    private fun recycleOne() {
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = AdapterOne(list)
        rv.setHasFixedSize(false)
    }

    private fun recycleTwo() {
        rvTwo.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvTwo.adapter = AdapterTwo(list)
        rvTwo.setHasFixedSize(false)
    }
}
