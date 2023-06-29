package com.asyncan.sharps.model.datatypes

data class AdminPurgePerson(
    val id: Int,
    val admin_person_id: PersonId,
    val reason: String? = null,
    val when_: String,
)
