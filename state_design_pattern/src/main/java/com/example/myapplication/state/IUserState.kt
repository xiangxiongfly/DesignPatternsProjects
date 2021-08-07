package com.example.myapplication.state

import android.content.Context

interface IUserState {
    fun like(context: Context)
    fun comment(context: Context)
}