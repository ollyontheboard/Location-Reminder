package com.udacity.project4.authentication

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class LoginViewModel: ViewModel() {
    val authenticationState = FireBaseUserLiveData().map { user ->
        if (user != null) {
            AuthenticationState.AUTHENTICATED
        } else {
            AuthenticationState.UNAUTHENTICATED
        }
    }
    fun getFactToDisplay(context: Context): String {

        return "Welcome to the Location Reminder App"
    }
}