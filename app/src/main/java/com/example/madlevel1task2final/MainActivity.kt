package com.example.madlevel1task2final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.madlevel1task2final.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}