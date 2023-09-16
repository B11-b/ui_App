package com.proj.project1k

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project1k.databinding.SignupActivityBinding

class SignupActivity:AppCompatActivity() {
    lateinit var binding: SignupActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= SignupActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}