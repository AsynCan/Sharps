package com.asyncan.sharps.model.datatypes

data class ApproveRegistrationApplication(
    val id: Int,
    val approve: Boolean,
    val deny_reason: String? = null,
    val auth: String,
)
