package com.example.roomease.data.model

import android.provider.ContactsContract.CommonDataKinds.Email

data class User(
    val userid: String = "",
    val username: String = "",
    val role: String = "",  // "Student" or "Worker"
    val email: String? = null,
    val phoneNumber: String? = null,
    val profilePictureUrl: String?
)