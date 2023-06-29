package com.asyncan.sharps.model.datatypes

data class DistinguishComment(
    val comment_id: CommentId,
    val distinguished: Boolean,
    val auth: String,
)
