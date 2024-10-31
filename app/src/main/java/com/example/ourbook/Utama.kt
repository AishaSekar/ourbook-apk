package com.example.ourbook

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Utama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_utama)
        val Duration: Long = 3000

        Handler().postDelayed({
            val intent = Intent(this@Utama, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, Duration)
    }
}