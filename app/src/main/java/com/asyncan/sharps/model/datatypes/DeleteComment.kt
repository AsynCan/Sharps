package com.asyncan.sharps.model.datatypes

data class DeleteComment(
    val comment_id: CommentId,
    val deleted: Boolean,
    val auth: String,
)
