package com.example.myapplication.state

import android.content.Context
import android.widget.Toast

class LoginedState : IUserState {
    override fun like(context: Context) {
        Toast.makeText(context, "点赞", Toast.LENGTH_SHORT).show()
    }

    override fun comment(context: Context) {
        Toast.makeText(context, "评论", Toast.LENGTH_SHORT).show()
    }
}