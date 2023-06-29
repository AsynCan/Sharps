package com.asyncan.sharps.model.datatypes

data class GetCommunity(
    val id: CommunityId? = null,
    val name: String? = null,
    val auth: String? = null,
)
