package com.MasDiq.Data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
    var title: String = "",
    var subtitle: String = "",
    var image: Int = 0,
    var price: String = "",
    var desc: String = ""
) : Parcelable
