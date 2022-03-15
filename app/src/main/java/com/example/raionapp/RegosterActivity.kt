package com.example.raionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class RegosterActivity : AppCompatActivity(), View.OnClickListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regoster)

        val signUP = findViewById(R.id.logIn) as TextView
        signUP.setOnClickListener{
            val moveSignUp = Intent(this, loginActivity::class.java)
            startActivity(moveSignUp)
        }
        val Login: Button = findViewById(R.id.singIn)
        Login.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
//            R.id.Signup -> {
//                Toast.makeText(this, "yu-0p", Toast.LENGTH_SHORT).show()
////                val moveSignUp = Intent(this@loginActivity, Register::class.java)
////                startActivity(moveSignUp)
//            }
            R.id.singIn -> {
//                Toast.makeText(this, "ya dipencet", Toast.LENGTH_SHORT).show()
                val movelogin = Intent(this, MainActivity::class.java)
                startActivity(movelogin)
            }

        }
    }
}