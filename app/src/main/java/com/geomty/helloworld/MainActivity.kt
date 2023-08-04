package com.geomty.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.graphics.Color
import com.geomty.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tapMeButton.setOnClickListener {
            binding.helloWorldText.setTextColor(Color.parseColor("#${makeColor()}${makeColor()}${makeColor()}"))
        }
    }
    private fun makeColor(): String {
        val hex = Integer.toHexString((1..255).random())
        if (hex.length == 1) {
            return "0${hex}"
        }
        return hex
    }
}