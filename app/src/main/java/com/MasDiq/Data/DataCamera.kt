package com.MasDiq.Data

import com.MasDiq.ProjectStarter.R

object DataCamera {
    private val imageId = arrayListOf(
        R.drawable.alpha_1,
        R.drawable.alpha_6100,
        R.drawable.alpha_6400,
        R.drawable.alpha_6600,
        R.drawable.alpha_7c,
        R.drawable.alpha_7r_3,
        R.drawable.fx3
    )

    private val title = arrayListOf(
        "Sony α1",
        "Sony α6100",
        "Sony α6400",
        "Sony α6600",
        "Sony α7C",
        "Sony α7R III",
        "Sony FX3"
    )

    private val subtitle = arrayListOf(
        "Superb Resolution Camera",
        "APS-C camera with Fast AF",
        "E-mount with APS-C Sensor",
        "Premium E-mount APS-C",
        "Mini Full-frame Camera",
        "35mm Full-frame Camera",
        "Full-frame Cinema Line",
    )

    private val price = arrayListOf(
        "Coming Soon",
        "Rp.9,999,000",
        "Rp.12,999,000",
        "Rp.20,999,000",
        "Rp.26,999,000",
        "Rp.36,999,000",
        "Coming Soon",
    )

    val listCamera: ArrayList<Data>
        get() {
            val list = arrayListOf<Data>()
            for (x in title.indices) {
                val data = Data()
                data.image = imageId[x]
                data.title = title[x]
                data.subtitle = subtitle[x]
                data.price = price[x]
                list.add(data)
            }
            return list
        }
}