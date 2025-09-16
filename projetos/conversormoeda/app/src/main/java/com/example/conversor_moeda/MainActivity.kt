package com.example.conversor_moeda

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.conversor_moeda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEdit.setOnClickListener{
            val euros = binding.editTextText.text.toString().toDouble()
            val dolares = String.format("%2f", euros * 0.8)

            binding.textConvert.text = "${dolares}"
        }
    }
}