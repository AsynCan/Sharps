package com.asyncan.sharps.model.datatypes

data class DeletePost(
    val post_id: PostId,
    val deleted: Boolean,
    val auth: String,
)
