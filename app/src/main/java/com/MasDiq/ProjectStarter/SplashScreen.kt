package com.MasDiq.ProjectStarter

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Delay splash for 1 sec
        Handler(mainLooper).postDelayed({
            val move = Intent(this, LoginScreen::class.java)
            startActivity(move)
            finish()
        }, 3000)
    }
}