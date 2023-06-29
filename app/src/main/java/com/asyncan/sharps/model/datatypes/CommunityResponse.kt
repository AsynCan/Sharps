package com.asyncan.sharps.model.datatypes

data class CommunityResponse(
    val community_view: CommunityView,
    val discussion_languages: List<LanguageId>,
)
