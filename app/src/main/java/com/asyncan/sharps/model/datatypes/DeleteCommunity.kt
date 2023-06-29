package com.asyncan.sharps.model.datatypes

data class DeleteCommunity(
    val community_id: CommunityId,
    val deleted: Boolean,
    val auth: String,
)
