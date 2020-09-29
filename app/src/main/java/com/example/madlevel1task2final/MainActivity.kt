package com.example.madlevel1task2final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2final.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var answersCorrect: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews(){
        binding.btnSubmit.setOnClickListener{onButtonPress()}
    }

    private fun onButtonPress(){
        answersCorrect = 0

        val answer1 = binding.a1.text.toString()
        val answer2 = binding.a2.text.toString()
        val answer3 = binding.a3.text.toString()
        val answer4 = binding.a4.text.toString()


        if (answer1 == "T"){
            answersCorrect++
        }
        if (answer2 == "F"){
            answersCorrect++
        }
        if (answer3 == "F"){
            answersCorrect++
        }
        if (answer4 == "F"){
            answersCorrect++
        }

        giveMessage()
    }

    private fun giveMessage(){
        if (answersCorrect == 4){
            Toast.makeText(this,getString(R.string.Correct), Toast.LENGTH_LONG).show()
        }

        if (answersCorrect <= 4){
            Toast.makeText(this,getString(R.string.Incorrect, answersCorrect), Toast.LENGTH_LONG).show()
        }
    }





}