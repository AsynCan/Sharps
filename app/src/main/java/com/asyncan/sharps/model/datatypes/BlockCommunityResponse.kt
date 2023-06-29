package com.asyncan.sharps.model.datatypes

data class BlockCommunityResponse(
    val community_view: CommunityView,
    val blocked: Boolean,
)
