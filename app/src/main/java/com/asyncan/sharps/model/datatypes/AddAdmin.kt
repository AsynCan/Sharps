package com.asyncan.sharps.model.datatypes

data class AddAdmin(
    val person_id: PersonId,
    val added: Boolean,
    val auth: String,
)
