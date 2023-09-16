package com.proj.project1k

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project1k.databinding.MainActivityBinding

class MainActivity:AppCompatActivity() {

    lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}