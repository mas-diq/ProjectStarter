package com.MasDiq.ProjectStarter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.MasDiq.Adapter.AdapterOne
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = arrayListOf<String>("A7 Mark I, A7 Mark II, A7  Mark II")
        val adapter = AdapterOne(this, data)
        rv.adapter = adapter
        rv.layoutManager = RecyclerView.LayoutManager(this)
    }
}