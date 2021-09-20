package com.MasDiq.ProjectStarter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.MasDiq.Adapter.AdapterCanon
import com.MasDiq.Adapter.AdapterSony
import com.MasDiq.Data.Data
import com.MasDiq.Data.DataCanon
import com.MasDiq.Data.DataSony
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var listSony: ArrayList<Data> = arrayListOf()
    private var listCanon: ArrayList<Data> = arrayListOf()
    private lateinit var adapterSony: AdapterSony
    private lateinit var adapterCanon: AdapterCanon

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Change status bar colors
        val window = this.window
        window.statusBarColor = this.resources.getColor(R.color.primaryColor)

        listSony.addAll(DataSony.listCameraSony)
        listCanon.addAll(DataCanon.listCameraCanon)

        // RecyclerView
        recycleOne()
        recycleTwo()
    }

    private fun recycleOne() {
        rv.layoutManager = LinearLayoutManager(this)
        adapterSony = AdapterSony(listSony)
        rv.adapter = adapterSony
        rv.setHasFixedSize(false)

        // Move to detail
        adapterSony.onClickItem = {
            val move = Intent(this, DetailActivity::class.java)
            move.putExtra(DetailActivity.EXTRA, it)
            startActivity(move)
        }
    }

    private fun recycleTwo() {
        rvTwo.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        adapterCanon = AdapterCanon(listCanon)
        rvTwo.adapter = adapterCanon
        rvTwo.setHasFixedSize(false)

        // Move to detail
        adapterCanon.onClickItem = {
            val move = Intent(this, DetailActivity::class.java)
            move.putExtra(DetailActivity.EXTRA, it)
            startActivity(move)
        }
    }
}
