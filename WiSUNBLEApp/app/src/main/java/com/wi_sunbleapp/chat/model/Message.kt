package com.wi_sunbleapp.chat.model

data class Message(
    val content: String,
    val timestamp: Long,
    val sender: String //this can be "android" "arduino"
)
