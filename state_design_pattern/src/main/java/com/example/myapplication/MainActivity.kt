package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.state.LoginContext
import com.example.myapplication.state.LogoutState

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.like).setOnClickListener {
            LoginContext.like(this)
        }
        findViewById<Button>(R.id.comment).setOnClickListener {
            LoginContext.comment(this)
        }
        findViewById<Button>(R.id.to_login).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        findViewById<Button>(R.id.logout).setOnClickListener {
            LoginContext.userState = LogoutState()
        }
    }
}