package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.weatherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.relativeLayout1.setOnClickListener {
            Intent(this, Weather::class.java).apply {
                startActivity(this)
            }
        }
        binding.relativeLayout2.setOnClickListener {
            Intent(this, Weather::class.java).apply {
                startActivity(this)
            }
        }
        binding.relativeLayout3.setOnClickListener {
            Intent(this, Weather::class.java).apply {
                startActivity(this)
            }
        }
        binding.relativeLayout4.setOnClickListener {
            Intent(this, Weather::class.java).apply {
                startActivity(this)
            }
        }
        binding.relativeLayout5.setOnClickListener {
            Intent(this, Weather::class.java).apply {
                startActivity(this)
            }
        }
        binding.relativeLayout6.setOnClickListener {
            Intent(this, Weather::class.java).apply {
                startActivity(this)
            }
        }
    }
}