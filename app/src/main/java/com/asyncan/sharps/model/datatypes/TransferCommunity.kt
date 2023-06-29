package com.asyncan.sharps.model.datatypes

data class TransferCommunity(
    val community_id: CommunityId,
    val person_id: PersonId,
    val auth: String,
)
