package com.MasDiq.ProjectStarter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login_screen.*

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        val window = this.window
        window.statusBarColor = this.resources.getColor(R.color.primaryColor)

        btnRegister.setOnClickListener {
            val move = Intent(this, Register::class.java)
            startActivity(move)
        }

        btnLogin.setOnClickListener {
            val move = Intent(this, MainActivity::class.java)
            startActivity(move)
        }
    }
}

