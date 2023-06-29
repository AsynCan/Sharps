package com.asyncan.sharps.model.datatypes

data class EditCommunity(
    val community_id: CommunityId,
    val title: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val banner: String? = null,
    val nsfw: Boolean? = null,
    val posting_restricted_to_mods: Boolean? = null,
    val discussion_languages: List<LanguageId>? = null,
    val auth: String,
)
