package com.example.roomease.viewModel

import android.app.Activity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cleaningapp.data.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor
    (private val authRepository: AuthRepository) : ViewModel() {

    fun signInWithEmail(email: String, password: String, onResult: (Boolean) -> Unit) {
        viewModelScope.launch {
            val user = authRepository.signInWithEmail(email, password)
            onResult(user != null)
        }
    }

    fun sendOtp(phoneNumber: String, activity: Activity) {
        authRepository.sendOtp(phoneNumber, activity)
    }
}