package com.proj.project1k

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.project1k.databinding.LoginActivityBinding


class LoginActivity :AppCompatActivity(){
    lateinit var binding: LoginActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= LoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val email= binding.mailEd.text
        val password=binding.passEd.text
      binding.loginButton.setOnClickListener {
          if ((email.isNotEmpty() && password.isNotEmpty())){
              Toast.makeText(this,"Login successfully !",Toast.LENGTH_LONG).show()
              val intent = Intent(this, MenuActivity::class.java)
              intent.putExtra("login", "Hi $email !")
              startActivity(intent)
             // startActivity(Intent(this, MenuActivity::class.java))
          } else{
              Toast.makeText(this,"Please login ",Toast.LENGTH_LONG).show()
          }

      }
        binding.dontTxt.setOnClickListener{
            startActivity(Intent(this, SignupActivity::class.java))
        }




    }
}