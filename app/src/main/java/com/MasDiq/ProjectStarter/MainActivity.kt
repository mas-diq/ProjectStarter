package com.MasDiq.ProjectStarter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.MasDiq.Adapter.AdapterOne
import com.MasDiq.Data.DataCamera
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var arrayList: ArrayList<DataCamera>
    private lateinit var imageId: ArrayList<Int>
    private lateinit var title: ArrayList<String>
    private lateinit var subtitle: ArrayList<String>
    private lateinit var price: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)
        arrayList = arrayListOf()

        imageId = arrayListOf(
            R.drawable.alpha_1,
            R.drawable.alpha_6100,
            R.drawable.alpha_6400,
            R.drawable.alpha_6600,
            R.drawable.alpha_7c,
            R.drawable.alpha_7r_3,
            R.drawable.fx3
        )

        title = arrayListOf(
            "Sony α1",
            "Sony α6100",
            "Sony α6400",
            "Sony α6600",
            "Sony α7C",
            "Sony α7R III",
            "Sony FX3"
        )

        subtitle = arrayListOf(
            "Superb Resolution Camera",
            "APS-C camera with Fast AF",
            "E-mount with APS-C Sensor",
            "Premium E-mount APS-C",
            "Mini Full-frame Camera",
            "35mm Full-frame Camera",
            "Full-frame Cinema Line",
        )

        price = arrayListOf(
            "Coming Soon",
            "Rp.9,999,000",
            "Rp.12,999,000",
            "Rp.20,999,000",
            "Rp.26,999,000",
            "Rp.36,999,000",
            "Coming Soon",
        )

        // Masukin data
        for (x in imageId.indices) {
            val camera = DataCamera(title[x], subtitle[x], imageId[x], price[x])
            arrayList.add(camera)
        }
        rv.adapter = AdapterOne(arrayList)
    }
}