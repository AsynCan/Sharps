package com.asyncan.sharps.model.datatypes

data class BanPersonResponse(
    val person_view: PersonView,
    val banned: Boolean,
)
