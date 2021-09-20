package com.MasDiq.ProjectStarter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.MasDiq.Data.Data
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    // catch from main
    private var data: Data? = null

    companion object {
        const val EXTRA = "extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Change status bar colors
        val window = this.window
        window.statusBarColor = this.resources.getColor(R.color.primaryColor)

        // setup in detail
        data = intent.getParcelableExtra(EXTRA)

        if (data != null) {
            Glide.with(this).load(data?.image)
                .apply(RequestOptions())
                .into(img_photo_detail)
            tv_title_detail.text = data?.title
            tv_subtitle_detail.text = data?.subtitle
            tv_price_detail.text = data?.price
            tv_desc_detail.text = data?.desc
        }

        // back to main
        btn_back.setOnClickListener {
            val move = Intent(this, MainActivity::class.java)
            startActivity(move)
        }
    }
}