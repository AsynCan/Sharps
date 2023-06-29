package com.asyncan.sharps.model.datatypes

data class PurgePerson(
    val person_id: PersonId,
    val reason: String? = null,
    val auth: String,
)
