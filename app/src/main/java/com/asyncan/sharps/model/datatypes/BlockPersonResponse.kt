package com.asyncan.sharps.model.datatypes

data class BlockPersonResponse(
    val person_view: PersonView,
    val blocked: Boolean,
)
