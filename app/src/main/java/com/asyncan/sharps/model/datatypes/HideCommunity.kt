package com.asyncan.sharps.model.datatypes

data class HideCommunity(
    val community_id: CommunityId,
    val hidden: Boolean,
    val reason: String? = null,
    val auth: String,
)
