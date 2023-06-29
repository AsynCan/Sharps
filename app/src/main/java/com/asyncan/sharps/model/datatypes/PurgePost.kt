package com.asyncan.sharps.model.datatypes

data class PurgePost(
    val post_id: PostId,
    val reason: String? = null,
    val auth: String,
)
