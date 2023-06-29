package com.asyncan.sharps.model.datatypes

data class PasswordChangeAfterReset(
    val token: String,
    val password: String,
    val password_verify: String,
)
