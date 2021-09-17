package com.MasDiq.ProjectStarter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val window = this.window
        window.statusBarColor = this.resources.getColor(R.color.primaryColor)

        btnRegister.setOnClickListener {
            val move = Intent(this, LoginScreen::class.java)
            startActivity(move)
        }
    }
}