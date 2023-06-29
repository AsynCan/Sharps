package com.asyncan.sharps.model.datatypes

data class BlockPerson(
    val person_id: PersonId,
    val block: Boolean,
    val auth: String,
)
