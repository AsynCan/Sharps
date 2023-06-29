package com.asyncan.sharps.model.datatypes

data class RemoveCommunity(
    val community_id: CommunityId,
    val removed: Boolean,
    val reason: String? = null,
    val expires: Int? = null,
    val auth: String,
)
