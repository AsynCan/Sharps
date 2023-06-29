package com.asyncan.sharps.model.datatypes

data class CreatePrivateMessage(
    val content: String,
    val recipient_id: PersonId,
    val auth: String,
)
