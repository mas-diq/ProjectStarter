package com.MasDiq.ProjectStarter

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login_screen.*

class LoginScreen : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            btnLogin -> run {
                val moveIntentAbout = Intent(this@LoginScreen, Register::class.java)
                startActivity(moveIntentAbout)
            }
        }
    }