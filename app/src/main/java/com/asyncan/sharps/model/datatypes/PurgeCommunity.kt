package com.asyncan.sharps.model.datatypes

data class PurgeCommunity(
    val community_id: CommunityId,
    val reason: String? = null,
    val auth: String,
)
