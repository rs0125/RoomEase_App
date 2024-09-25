package com.example.roomease.auth

import java.lang.Error

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)