package com.asyncan.sharps.model.datatypes

data class CreateCommentLike(
    val comment_id: CommentId,
    val score: Int,
    val auth: String,
)
