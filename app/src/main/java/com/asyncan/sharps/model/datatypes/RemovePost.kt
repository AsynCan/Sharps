package com.asyncan.sharps.model.datatypes

data class RemovePost(
    val post_id: PostId,
    val removed: Boolean,
    val reason: String? = null,
    val auth: String,
)
