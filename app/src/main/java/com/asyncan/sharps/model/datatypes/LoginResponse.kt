package com.asyncan.sharps.model.datatypes

data class LoginResponse(
    val jwt: String? = null,
    val registration_created: Boolean,
    val verify_email_sent: Boolean,
)
