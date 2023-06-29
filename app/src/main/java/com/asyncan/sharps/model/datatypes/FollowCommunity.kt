package com.asyncan.sharps.model.datatypes

data class FollowCommunity(
    val community_id: CommunityId,
    val follow: Boolean,
    val auth: String,
)
