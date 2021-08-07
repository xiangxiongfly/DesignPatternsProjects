package com.example.myapplication.state

import android.content.Context

object LoginContext {
    public var userState: IUserState = LogoutState()

    fun like(context: Context) {
        userState.like(context)
    }

    fun comment(context: Context) {
        userState.comment(context)
    }
}