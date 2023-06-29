package com.asyncan.sharps.model.datatypes

data class ListRegistrationApplications(
    val unread_only: Boolean? = null,
    val page: Int? = null,
    val limit: Int? = null,
    val auth: String,
)
