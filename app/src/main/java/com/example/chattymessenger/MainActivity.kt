package com.example.chattymessenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var splashScreen:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castviews()
    }
    fun castviews (){
        splashScreen=findViewById(R.id.tvSlashScreen)

        splashScreen.setOnClickListener {
            Toast.makeText(baseContext,"click",Toast.LENGTH_LONG).show()

            var intent=Intent(baseContext,MainActivity2 ::class.java)
            startActivity(intent)
        }

    }
}
