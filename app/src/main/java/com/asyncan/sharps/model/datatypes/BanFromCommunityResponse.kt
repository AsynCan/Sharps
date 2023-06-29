package com.asyncan.sharps.model.datatypes

data class BanFromCommunityResponse(
    val person_view: PersonView,
    val banned: Boolean,
)
