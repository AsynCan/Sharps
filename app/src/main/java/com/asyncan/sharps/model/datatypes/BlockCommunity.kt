package com.asyncan.sharps.model.datatypes

data class BlockCommunity(
    val community_id: CommunityId,
    val block: Boolean,
    val auth: String,
)
