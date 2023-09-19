package com.proj.project1k

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.project1k.databinding.SignupActivityBinding


class SignupActivity:AppCompatActivity() {
    lateinit var binding: SignupActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= SignupActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name=binding.nameEd.text
        val email= binding.mailEd.text
        val password = binding.passEd.text
        val repassword= binding.repasswordEd.text
        binding.loginButton.setOnClickListener {
            if ((email.isNotEmpty() && password.isNotEmpty()&&password.isNotEmpty()&&repassword.isNotEmpty())){
                val intent = Intent(this, MenuActivity::class.java)
                intent.putExtra("Username", "Hi $name !")
                startActivity(intent)
            } else{
                Toast.makeText(this,"Error!!",Toast.LENGTH_LONG).show()
            }
        }
        binding.dontTxt.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }

    }
}