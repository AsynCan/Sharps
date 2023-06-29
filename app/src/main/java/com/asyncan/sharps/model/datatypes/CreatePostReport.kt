package com.asyncan.sharps.model.datatypes

data class CreatePostReport(
    val post_id: PostId,
    val reason: String,
    val auth: String,
)
