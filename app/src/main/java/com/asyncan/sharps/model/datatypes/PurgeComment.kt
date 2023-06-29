package com.asyncan.sharps.model.datatypes

data class PurgeComment(
    val comment_id: CommentId,
    val reason: String? = null,
    val auth: String,
)
