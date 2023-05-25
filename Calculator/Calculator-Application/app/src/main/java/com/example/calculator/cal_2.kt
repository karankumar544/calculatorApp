package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.postDelayed

class cal_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal2)
        Handler().postDelayed(Runnable {
            startActivity(Intent(this@cal_2,MainActivity::class.java))
            finish();
        },2000)
    }
}