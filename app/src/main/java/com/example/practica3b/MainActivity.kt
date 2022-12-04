package com.example.practica3b

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var sb: SeekBar
    private lateinit var sb2: SeekBar
    private lateinit var sb3: SeekBar
    private lateinit var lblValor: TextView
    private lateinit var lblValor2: TextView
    private lateinit var lblValor3: TextView
    private lateinit var lblColor: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sb = findViewById(R.id.seekBar)
        sb2 = findViewById(R.id.seekBar2)
        sb3 = findViewById(R.id.seekBar3)
        lblValor = findViewById(R.id.lblValor)
        lblValor2 = findViewById(R.id.lblValor2)
        lblValor3 = findViewById(R.id.lblValor3)
        lblColor = findViewById(R.id.lblColor)

        val osbcl: SeekBar.OnSeekBarChangeListener = object : SeekBar.OnSeekBarChangeListener {
        @SuppressLint("SetTextI18n")
        override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
            val a: Int = sb.progress
            val b: Int = sb2.progress
            val c: Int = sb3.progress
            lblColor.setBackgroundColor(Color.argb(255, a, b, c))
            when (seekBar.id) {
                sb.id -> lblValor.text = "-->$progress"
                sb2.id -> lblValor2.text = "-->$progress"
                sb3.id -> lblValor3.text = "-->$progress"
            }
        }
            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        }
        sb.setOnSeekBarChangeListener(osbcl)
        sb2.setOnSeekBarChangeListener(osbcl)
        sb3.setOnSeekBarChangeListener(osbcl)
    }
}
