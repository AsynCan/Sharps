package com.asyncan.sharps.model.datatypes

data class CreatePostLike(
    val post_id: PostId,
    val score: Int,
    val auth: String,
)
