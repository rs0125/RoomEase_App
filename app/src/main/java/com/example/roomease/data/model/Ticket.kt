package com.example.roomease.data.model

data class Ticket(
    val id: String = "",
    val userId: String = "",
    val category: String = "",
    val description: String = "",
    val status: String = "Pending",  // "Pending" or "Completed"
    val createdAt: Long = System.currentTimeMillis(),
    val completedAT: Long? = null
)