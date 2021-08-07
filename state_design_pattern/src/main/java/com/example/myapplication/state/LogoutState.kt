package com.example.myapplication.state

import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.example.myapplication.LoginActivity

class LogoutState : IUserState {
    override fun like(context: Context) {
        toLogin(context)
    }

    override fun comment(context: Context) {
        toLogin(context)
    }

    private fun toLogin(context: Context) {
        context.startActivity(Intent(context, LoginActivity::class.java))
    }
}