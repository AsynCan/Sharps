package com.asyncan.sharps.model.datatypes

data class CreateCommentReport(
    val comment_id: CommentId,
    val reason: String,
    val auth: String,
)
