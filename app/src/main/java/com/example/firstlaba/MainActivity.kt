package com.example.firstlaba

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.firstlaba.databinding.ActivityMainBinding
import java.lang.Math.random

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        setContentView(binding.root)
        binding.button.setOnClickListener {
            increment()
        }
        binding.replaceButton.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            var temp = (0..binding.textView.text.toString().toInt()).random()
            intent.putExtra("number", temp)
            Log.d("Tag", temp.toString())
            startActivity(intent)
        }
    }

    private fun increment() {
        var temp: Int = binding.textView.text.toString().toInt() + 1
        binding.textView.text = temp.toString()
    }
}