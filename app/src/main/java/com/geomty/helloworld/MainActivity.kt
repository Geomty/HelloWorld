package com.geomty.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.graphics.Color
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text : TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            text.setTextColor(Color.parseColor("#${makeColor()}${makeColor()}${makeColor()}"))
        }
    }
    private fun makeColor(): String {
        var hex = Integer.toHexString((1..255).random())
        if (hex.length == 1) {
            return "0${hex}"
        }
        return hex
    }
}