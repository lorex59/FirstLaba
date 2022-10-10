package com.example.firstlaba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstlaba.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.number.text = intent.getIntExtra("number", 0).toString()

    }
}