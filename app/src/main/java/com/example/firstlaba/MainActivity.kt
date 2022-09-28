package com.example.firstlaba

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstlaba.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        setContentView(binding.root)
        binding.button.setOnClickListener {
            increment()
        }
    }

    private fun increment() {
        var temp: Int = binding.textView.text.toString().toInt() + 1
        binding.textView.text = temp.toString()
    }
}