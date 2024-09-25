package com.example.roomease.view.auth

import android.app.Activity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.roomease.viewModel.AuthViewModel

@Composable
fun WorkerOTPScreen(activity: Activity, authViewModel: AuthViewModel = viewModel()) {
    var phoneNumber by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Worker OTP Login")
        TextField(value = phoneNumber, onValueChange = { phoneNumber = it }, label = { Text("Phone Number") })
        Button(onClick = {
            authViewModel.sendOtp(phoneNumber, activity)
            // Show a prompt for OTP entry after sending
        }) {
            Text("Send OTP")
        }
    }
}